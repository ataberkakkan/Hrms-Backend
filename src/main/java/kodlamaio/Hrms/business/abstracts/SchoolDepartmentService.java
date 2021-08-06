package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.SchoolDepartment;

import java.util.List;

public interface SchoolDepartmentService {
    Result add(SchoolDepartment schoolDepartment);
    DataResult<List<SchoolDepartment>> getAll();
}
