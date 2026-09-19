class ReconciliationService:

    def __init__(self, strategy):
        self.strategy = strategy

    def reconcile(self, data):
        return self.strategy.reconcile(data)