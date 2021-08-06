package kodlamaio.Hrms.business.concretes;

import kodlamaio.Hrms.business.abstracts.SchoolDepartmentService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.SchoolDepartmentDao;
import kodlamaio.Hrms.entities.concretes.SchoolDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchoolDepartmentManager implements SchoolDepartmentService {
    private SchoolDepartmentDao schoolDepartmentDao;

    @Autowired
    public SchoolDepartmentManager(SchoolDepartmentDao schoolDepartmentDao) {
        this.schoolDepartmentDao = schoolDepartmentDao;
    }

    @Override
    public Result add(SchoolDepartment schoolDepartment) {
        this.schoolDepartmentDao.save(schoolDepartment);
        return new SuccessResult("Eklendi");
    }

    @Override
    public DataResult<List<SchoolDepartment>> getAll() {
        return new SuccessDataResult<List<SchoolDepartment>>(this.schoolDepartmentDao.findAll());
    }
}
