package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    Result add(User user);
    DataResult<List<User>> getAll();
}
