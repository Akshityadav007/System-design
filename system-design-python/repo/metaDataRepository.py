from abc import ABC, abstractmethod


class MetadataRepository(ABC):

    @abstractmethod
    def start_run(self):
        """Create a run record and return a run identifier."""

    @abstractmethod
    def record_run(self, metadata):
        """Persist the metadata for a run."""

    @abstractmethod
    def update_status(self, run_id, status):
        """Update the status of an existing run."""