from writers.targetWriter import TargetWriter


class SFTPTargetWriter(TargetWriter):

    def write(self, data, run_id):
        # upload data to target with the run_id as context
        return {"run_id": run_id, "target_rows": len(data) if hasattr(data, '__len__') else 0}