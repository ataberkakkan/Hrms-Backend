package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.ImageService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImagesController {

    private ImageService imageService;

    @Autowired
    public ImagesController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("/save")
    public Result add(@RequestBody Image image){
        return this.imageService.add(image);
    }

    @GetMapping("/getAll")
    public DataResult<List<Image>> getAll(){
        return this.imageService.getAll();
    }

}
