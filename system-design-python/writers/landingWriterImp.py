from writers.landingWriter import LandingWriter


class BlobLandingWriter(LandingWriter):

    def write(self, data, run_id):
        # check if blob is present, if not create one
        # write the csv file
        # return true
        return {"run_id": run_id, "landing_rows": len(data) if hasattr(data, '__len__') else 0}