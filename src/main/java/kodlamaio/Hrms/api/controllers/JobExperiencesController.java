package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.JobExperienceService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experiences")
public class JobExperiencesController {

    private JobExperienceService jobExperienceService;

    @Autowired
    public JobExperiencesController(JobExperienceService jobExperienceService) {
        this.jobExperienceService = jobExperienceService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobExperience jobExperience){
        return this.jobExperienceService.add(jobExperience);
    }

    @GetMapping("/getAll")
    public DataResult<List<JobExperience>> getAll(){
        return this.jobExperienceService.getAll();
    }

}
