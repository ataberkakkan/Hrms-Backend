package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.JobSeekerService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @PostMapping("/register")
    public Result add(@RequestBody JobSeekers jobSeekers){
        return this.jobSeekerService.add(jobSeekers);
    }

    @GetMapping("/getall")
    public DataResult<List<JobSeekers>> getAll(){
       return this.jobSeekerService.getAll();
    }
}
