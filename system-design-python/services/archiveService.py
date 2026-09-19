class ArchiveService:

    def archive(self, data, run_id):
        """Archive the landing payload for auditability."""
        return {"run_id": run_id, "archived_rows": len(data) if hasattr(data, '__len__') else 0}