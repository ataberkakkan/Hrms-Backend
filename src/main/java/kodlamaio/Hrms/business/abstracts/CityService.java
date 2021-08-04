package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.City;

import java.util.List;

public interface CityService {
    Result add(City city);
    DataResult<List<City>> getAll();
}
