from abc import ABC, abstractmethod
from dataclasses import dataclass, field


@dataclass
class ReconciliationResult:
    success: bool
    reconciled_data: object = None
    reason: str = ""
    details: dict = field(default_factory=dict)


class ReconciliationStrategy(ABC):

    @abstractmethod
    def reconcile(self, data):
        """Return a reconciliation result for the incoming payload."""


class CountReconciliation(ReconciliationStrategy):

    def reconcile(self, data):
        # row count validation check
        if not data:
            return ReconciliationResult(success=False, reconciled_data=data, reason="No data to reconcile")
        return ReconciliationResult(success=True, reconciled_data=data, details={"row_count": len(data)})