package kodlamaio.Hrms.business.concretes;

import kodlamaio.Hrms.business.abstracts.JobPositionService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.Hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }


    @Override
    public Result add(JobPosition jobPosition) {
        this.jobPositionDao.save(jobPosition);
        return new SuccessResult("İş pozisyonu eklendi.");
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>>
                (this.jobPositionDao.findAll(),"Data Listelendi.");

    }
}
