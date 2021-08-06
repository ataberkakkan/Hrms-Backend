package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.JobSeekerCvService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobSeekerCv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seekercv")
public class JobSeekerCvController {

    private JobSeekerCvService jobSeekerCvService;

    @Autowired
    public JobSeekerCvController(JobSeekerCvService jobSeekerCvService) {
        this.jobSeekerCvService = jobSeekerCvService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobSeekerCv jobSeekerCv){
        return this.jobSeekerCvService.add(jobSeekerCv);
    }

    @GetMapping("/getAll")
    public DataResult<List<JobSeekerCv>> getAll(){
        return this.jobSeekerCvService.getAll();
    }
}
