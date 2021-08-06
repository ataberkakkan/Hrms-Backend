package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobSeekerCv;

import java.util.List;

public interface JobSeekerCvService {
    Result add(JobSeekerCv jobSeekerCv);
    DataResult<List<JobSeekerCv>> getAll();
}
