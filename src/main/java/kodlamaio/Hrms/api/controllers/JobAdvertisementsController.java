package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.Dtos.JobAdvertisementDto;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
    private JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @PostMapping("/add")
    Result add(@RequestBody JobAdvertisementDto jobAdvertisementDto){
        return this.jobAdvertisementService.add(jobAdvertisementDto);
    }

    @GetMapping("/getAllActives")
    DataResult<List<JobAdvertisement>> getAllActives(){
        return this.jobAdvertisementService.getAllActives();
    }

    @GetMapping("/getAllOrderByReleaseDateAsc")
    DataResult<List<JobAdvertisement>> getAllOrderByReleaseDateAsc(){
        return this.jobAdvertisementService.findAllByOrderByReleaseDateAsc();
    }

    @GetMapping("/getAllOrderByReleaseDateDesc")
    DataResult<List<JobAdvertisement>> getAllOrderByReleaseDateDesc(){
        return this.jobAdvertisementService.findAllByOrderByReleaseDateDesc();
    }

    @GetMapping("/getAllActivesByCompanyId")
    DataResult<List<JobAdvertisement>> getAllActivesByCompanyId(@RequestParam int id){
        return this.jobAdvertisementService.findAllActivesByCompanyId(id);
    }

    @PostMapping("/changeStatusOfJobAdvertisement")
    Result changeActiveStatus(@RequestParam boolean status, int jobAdvertisementId){
        return this.jobAdvertisementService.changeActiveStatus(status,jobAdvertisementId);
    }



}
