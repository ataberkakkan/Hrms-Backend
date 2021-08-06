package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.SkillService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

    private SkillService skillService;

    @Autowired
    public SkillsController(SkillService skillService) {
        this.skillService = skillService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Skill skill){
        return this.skillService.add(skill);
    }

    @GetMapping("/getall")
    public DataResult<List<Skill>> getAll(){
        return this.skillService.getAll();
    }
}
