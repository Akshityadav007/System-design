import importlib.util
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]


def load_module(module_name, relative_path):
    path = ROOT / relative_path
    spec = importlib.util.spec_from_file_location(module_name, path)
    module = importlib.util.module_from_spec(spec)
    spec.loader.exec_module(module)
    return module


source_module = load_module("source_client", "source/sourceClient.py")
metadata_module = load_module("metadata_repository", "repo/metaDataRepository.py")
recon_module = load_module("reconciliation_strategy", "services/reconcilliation/reconcillationStrategy.py")
runner_module = load_module("pipeline_runner", "pipelineRunner.py")

dq_module = load_module("dq_service", "services/dqService.py")
transformation_module = load_module("transformation_service", "services/transformationService.py")


class DummySource(source_module.SourceClient):
    def fetch(self):
        return [{"id": 1, "name": "Alice"}, {"id": 2, "name": "Bob"}]


class DummyMetadata(metadata_module.MetadataRepository):
    def __init__(self):
        self.statuses = {}

    def start_run(self):
        return "run-1"

    def record_run(self, metadata):
        self.last_run = metadata

    def update_status(self, run_id, status):
        self.statuses[run_id] = status


class DummyLandingWriter:
    def write(self, data, run_id):
        self.data = data
        self.run_id = run_id


class DummyArchiveService:
    def archive(self, data, run_id):
        self.data = data
        self.run_id = run_id


class DummyQuarantineService:
    def quarantine(self, data, reason, run_id):
        self.data = data
        self.reason = reason
        self.run_id = run_id


class DummyTransformer(transformation_module.TransformationService):
    def transform(self, data):
        return [{"id": item["id"], "name": item["name"].upper()} for item in data]

    def apply_scd2(self, current, incoming):
        return current


class DummyDQ(dq_module.DataQualityService):
    def __init__(self):
        pass

    def validate(self, data):
        return dq_module.DataQualityResult(success=True, violations=[])


class DummyTargetWriter:
    def write(self, data, run_id):
        self.data = data
        self.run_id = run_id


class DummyReconciliation(recon_module.ReconciliationStrategy):
    def reconcile(self, data):
        return recon_module.ReconciliationResult(success=True, reconciled_data=data)


def test_pipeline_runs_successfully():
    metadata = DummyMetadata()
    source = DummySource()
    landing_writer = DummyLandingWriter()
    archive = DummyArchiveService()
    quarantine = DummyQuarantineService()
    transformer = DummyTransformer()
    dq = DummyDQ()
    target_writer = DummyTargetWriter()
    reconciliation = DummyReconciliation()

    runner = runner_module.PipelineRunner(
        source=source,
        landing_writer=landing_writer,
        reconciliation=reconciliation,
        archive=archive,
        quarantine=quarantine,
        transformer=transformer,
        dq=dq,
        target_writer=target_writer,
        metadata=metadata,
    )

    runner.run()

    assert metadata.statuses["run-1"] == "SUCCESS"
    assert target_writer.data == [{"id": 1, "name": "ALICE"}, {"id": 2, "name": "BOB"}]


def test_reconciliation_result_contract_has_success_and_reason():
    result = recon_module.ReconciliationResult(success=False, reason="count mismatch")

    assert result.success is False
    assert result.reason == "count mismatch"
