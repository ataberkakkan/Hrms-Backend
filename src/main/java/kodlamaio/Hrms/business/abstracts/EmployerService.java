package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    Result add(Employer employer);
    DataResult<List<Employer>> getAll();
}
