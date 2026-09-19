from abc import ABC, abstractmethod


class LandingWriter(ABC):

    @abstractmethod
    def write(self, data, run_id):
        """Persist raw data into the landing zone."""