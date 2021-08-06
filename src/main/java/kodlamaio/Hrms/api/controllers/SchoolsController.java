package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.SchoolService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {

    private SchoolService schoolService;

    @Autowired
    public SchoolsController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody School school){
        return this.schoolService.add(school);
    }

    @GetMapping("/getall")
    public DataResult<List<School>> getAll(){
        return this.schoolService.getAll();
    }
}
