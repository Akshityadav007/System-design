class PipelineRunner:

    def __init__(self, source, landing_writer, reconciliation, archive, quarantine, transformer, dq, target_writer, metadata):
        self.source = source
        self.landing_writer = landing_writer
        self.reconciliation = reconciliation
        self.archive = archive
        self.quarantine = quarantine
        self.transformer = transformer
        self.dq = dq
        self.target_writer = target_writer
        self.metadata = metadata

    def run(self):
        run_id = self.metadata.start_run()
        self.metadata.record_run({"run_id": run_id, "status": "STARTED"})

        try:
            data = self.source.fetch()
            self.landing_writer.write(data, run_id)

            reconciliation_result = self.reconciliation.reconcile(data)
            if not reconciliation_result.success:
                self.quarantine.quarantine(data, reconciliation_result.reason, run_id)
                self.metadata.update_status(run_id, "QUARANTINED")
                return

            self.archive.archive(data, run_id)

            silver = self.transformer.transform(data)
            if hasattr(self.transformer, "apply_scd2"):
                silver = self.transformer.apply_scd2(silver, silver)

            dq_result = self.dq.validate(silver)
            if not dq_result.success:
                self.metadata.update_status(run_id, "DQ_FAILED")
                return

            self.target_writer.write(silver, run_id)
            self.metadata.update_status(run_id, "SUCCESS")

        except Exception:
            self.metadata.update_status(run_id, "FAILED")
            raise