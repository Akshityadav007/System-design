from source.sourceClient import SourceClient


class UsersApiClient(SourceClient):

    def fetch(self):
        # API authentication
        # pagination
        # API calls
        return [{"id": 1, "name": "Alice"}, {"id": 2, "name": "Bob"}]


class RolesApiClient(SourceClient):

    def fetch(self):
        # API authentication
        # pagination
        # API calls
        return [{"user_id": 1, "role": "admin"}, {"user_id": 2, "role": "analyst"}]