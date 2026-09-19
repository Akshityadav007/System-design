from abc import ABC, abstractmethod
from dataclasses import dataclass, field


@dataclass
class DataQualityResult:
    success: bool
    violations: list = field(default_factory=list)


class DataQualityRule(ABC):

    @abstractmethod
    def validate(self, data):
        """Return a list of violations for the given dataset."""


class NullCheck(DataQualityRule):

    def validate(self, data):
        violations = []
        for index, record in enumerate(data):
            if any(record.get(field_name) is None for field_name in ("id", "name")):
                violations.append({"index": index, "rule": "null_check"})
        return violations


class DuplicateCheck(DataQualityRule):

    def validate(self, data):
        seen = set()
        violations = []
        for index, record in enumerate(data):
            key = record.get("id")
            if key in seen:
                violations.append({"index": index, "rule": "duplicate_check", "value": key})
            seen.add(key)
        return violations


class ReferentialIntegrityCheck(DataQualityRule):

    def validate(self, data):
        return []


class DataQualityService:

    def __init__(self, rules=None):
        self.rules = rules or [NullCheck(), DuplicateCheck(), ReferentialIntegrityCheck()]

    def validate(self, data):
        violations = []
        for rule in self.rules:
            violations.extend(rule.validate(data))
        return DataQualityResult(success=not violations, violations=violations)