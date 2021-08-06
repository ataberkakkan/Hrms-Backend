package kodlamaio.Hrms.business.concretes;

import kodlamaio.Hrms.business.abstracts.ImageService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.ImageDao;
import kodlamaio.Hrms.entities.concretes.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImageManager implements ImageService {
    private ImageDao imageDao;

    @Autowired
    public ImageManager(ImageDao imageDao) {
        this.imageDao = imageDao;
    }

    @Override
    public Result add(Image image) {
        this.imageDao.save(image);
        return new SuccessResult("Başarıyla Eklendi");
    }

    @Override
    public DataResult<List<Image>> getAll() {
        return new SuccessDataResult<List<Image>>(this.imageDao.findAll());
    }
}
