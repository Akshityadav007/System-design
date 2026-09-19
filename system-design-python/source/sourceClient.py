from abc import ABC, abstractmethod


class SourceClient(ABC):

    @abstractmethod
    def fetch(self):
        """Load data from the upstream source system."""