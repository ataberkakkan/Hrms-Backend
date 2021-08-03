package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobSeekers;

import java.util.List;

public interface JobSeekerService {
    Result add(JobSeekers jobSeekers);
    DataResult<List<JobSeekers>> getAll();
}
