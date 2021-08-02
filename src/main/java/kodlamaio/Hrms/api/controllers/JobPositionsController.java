package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.JobPositionService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/JobPositions")
public class JobPositionsController {

    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionsController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPosition jobPosition){
        return this.jobPositionService.add(jobPosition);
    }


    @GetMapping("/getall")
    public DataResult<List<JobPosition>> getAll(){
        return this.jobPositionService.getAll();
    }
}
