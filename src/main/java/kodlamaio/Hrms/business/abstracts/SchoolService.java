package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.School;

import java.util.List;

public interface SchoolService {
    Result add(School school);
    DataResult<List<School>> getAll();
}
