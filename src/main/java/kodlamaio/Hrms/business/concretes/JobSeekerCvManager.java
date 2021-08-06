package kodlamaio.Hrms.business.concretes;

import kodlamaio.Hrms.business.abstracts.JobSeekerCvService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobSeekerCvDao;
import kodlamaio.Hrms.entities.concretes.JobSeekerCv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobSeekerCvManager implements JobSeekerCvService {
    private JobSeekerCvDao jobSeekerCvDao;

    @Autowired
    public JobSeekerCvManager(JobSeekerCvDao jobSeekerCvDao) {
        this.jobSeekerCvDao = jobSeekerCvDao;
    }

    @Override
    public Result add(JobSeekerCv jobSeekerCv) {
        this.jobSeekerCvDao.save(jobSeekerCv);
        return new SuccessResult("Eklendi");
    }

    @Override
    public DataResult<List<JobSeekerCv>> getAll() {
        return new SuccessDataResult<List<JobSeekerCv>>(this.jobSeekerCvDao.findAll());
    }
}
