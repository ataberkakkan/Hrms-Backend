package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobExperience;

import java.util.List;

public interface JobExperienceService {
    Result add(JobExperience jobExperience);
    DataResult<List<JobExperience>> getAll();
}
