package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.EducationalBackground;

import java.util.List;

public interface EducationalBackgroundService {
    Result add(EducationalBackground educationalBackground);
    DataResult<List<EducationalBackground>> getAll();
}
