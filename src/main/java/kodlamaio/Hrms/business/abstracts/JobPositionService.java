package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    Result add(JobPosition jobPosition);
    DataResult<List<JobPosition>> getAll();
}
