from uuid import uuid4

from repo.metaDataRepository import MetadataRepository


class MetadataRepositoryImpl(MetadataRepository):

    def __init__(self):
        self._runs = {}

    def start_run(self):
        run_id = str(uuid4())
        self._runs[run_id] = {"status": "STARTED"}
        return run_id

    def record_run(self, metadata):
        self._runs.setdefault(metadata["run_id"], {})
        self._runs[metadata["run_id"]].update(metadata)

    def update_status(self, run_id, status):
        if run_id not in self._runs:
            self._runs[run_id] = {}
        self._runs[run_id]["status"] = status

    def get_run(self, run_id):
        return self._runs.get(run_id, {})