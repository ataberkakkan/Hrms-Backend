package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Skill;

import java.util.List;

public interface SkillService {
    Result add(Skill skill);
    DataResult<List<Skill>> getAll();
}
