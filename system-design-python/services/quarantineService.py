class QuarantineService:

    def quarantine(self, data, reason, run_id):
        """Move invalid data to quarantine for investigation."""
        return {"run_id": run_id, "reason": reason, "quarantined_rows": len(data) if hasattr(data, '__len__') else 0}