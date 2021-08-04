package kodlamaio.Hrms.business.concretes;

import kodlamaio.Hrms.business.abstracts.JobSeekerService;
import kodlamaio.Hrms.core.utilities.results.*;
import kodlamaio.Hrms.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.Hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekersDao jobSeekersDao;

    @Autowired
    public JobSeekerManager(JobSeekersDao jobSeekersDao) {
        this.jobSeekersDao = jobSeekersDao;
    }


    @Override
    public Result add(JobSeekers jobSeekers) {
        if (this.jobSeekersDao.existsByNationalityId(jobSeekers.getNationalityId())){
            return new ErrorResult("Bu Tc Kimlik numarası kullanımda");
        }else if (this.jobSeekersDao.existsByEmail(jobSeekers.getEmail())){
            return new ErrorResult("Bu mail adresi kullanılıyor");
        }else{
            this.jobSeekersDao.save(jobSeekers);
            return new SuccessResult("Kullanıcı eklendi");
        }

    }

    @Override
    public DataResult<List<JobSeekers>> getAll() {
        return new SuccessDataResult<List<JobSeekers>>
                (this.jobSeekersDao.findAll(),"İş Arayanlar Listelendi.");
    }
}
