package kodlamaio.Hrms.business.concretes;

import kodlamaio.Hrms.business.abstracts.EducationalBackgroundService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.EducationalBackgroundDao;
import kodlamaio.Hrms.entities.concretes.EducationalBackground;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationalBackgroundManager implements EducationalBackgroundService {
    private EducationalBackgroundDao educationalBackgroundDao;

    @Autowired
    public EducationalBackgroundManager(EducationalBackgroundDao educationalBackgroundDao) {
        this.educationalBackgroundDao = educationalBackgroundDao;
    }

    @Override
    public Result add(EducationalBackground educationalBackground) {
        this.educationalBackgroundDao.save(educationalBackground);
        return new SuccessResult("Eklendi");
    }

    @Override
    public DataResult<List<EducationalBackground>> getAll() {
        return new SuccessDataResult<List<EducationalBackground>>(this.educationalBackgroundDao.findAll());
    }
}
