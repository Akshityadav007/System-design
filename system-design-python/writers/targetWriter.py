from abc import ABC, abstractmethod


class TargetWriter(ABC):

    @abstractmethod
    def write(self, data, run_id):
        """Write curated data to the target system."""