package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.EducationalBackgroundService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.EducationalBackground;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/background")
public class EducationalBackgroundsController {

    private EducationalBackgroundService educationalBackgroundService;

    @Autowired
    public EducationalBackgroundsController(EducationalBackgroundService educationalBackgroundService) {
        this.educationalBackgroundService = educationalBackgroundService;
    }

    @PostMapping("/save")
    public Result add(@RequestBody EducationalBackground educationalBackground){
        return this.educationalBackgroundService.add(educationalBackground);
    }

    @GetMapping("/getall")
    public DataResult<List<EducationalBackground>> getAll(){
       return this.educationalBackgroundService.getAll();
    }



}
