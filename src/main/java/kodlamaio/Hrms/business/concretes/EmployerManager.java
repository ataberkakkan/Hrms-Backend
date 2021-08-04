package kodlamaio.Hrms.business.concretes;

import kodlamaio.Hrms.business.abstracts.EmployerService;
import kodlamaio.Hrms.core.utilities.results.*;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public Result add(Employer employer) {
        if (this.employerDao.existsByEmail(employer.getEmail())){
            return new ErrorResult("Bu mail adresi kullanılıyor");
        }else {
            this.employerDao.save(employer);
            return new SuccessResult("İş Veren Eklendi");
        }

    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>
                (this.employerDao.findAll(), "İş Verenler Listelendi.");
    }
}
