package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.SchoolDepartmentService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.SchoolDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class SchoolDepartmentsController {

    private SchoolDepartmentService schoolDepartmentService;

    @Autowired
    public SchoolDepartmentsController(SchoolDepartmentService schoolDepartmentService) {
        this.schoolDepartmentService = schoolDepartmentService;
    }

    @PostMapping("/save")
    public Result add(@RequestBody SchoolDepartment schoolDepartment){
        return this.schoolDepartmentService.add(schoolDepartment);
    }

    @GetMapping("/getall")
    public DataResult<List<SchoolDepartment>> getAll(){
        return this.schoolDepartmentService.getAll();
    }
}
