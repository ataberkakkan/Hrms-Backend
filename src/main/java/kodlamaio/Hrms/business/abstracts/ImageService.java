package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Image;

import java.util.List;

public interface ImageService {
    Result add(Image image);
    DataResult<List<Image>> getAll();
}
