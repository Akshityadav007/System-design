from abc import ABC, abstractmethod


class TransformationService(ABC):

    @abstractmethod
    def transform(self, data):
        """Transform raw data into the curated model."""


class UserTransformer(TransformationService):

    def transform(self, data):
        return [{"id": item["id"], "name": item["name"].upper()} for item in data]

    def apply_scd2(self, current, incoming):
        # placeholder for historical tracking logic
        return current, incoming