package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    Result add(Language language);
    DataResult<List<Language>> getAll();
}
