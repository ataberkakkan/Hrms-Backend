package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.CityService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {
    private CityService cityService;

    @Autowired
    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }


    @PostMapping("/add")
    public Result add(@RequestBody City city) {
        return this.cityService.add(city);
    }

    @GetMapping("/getall")
    public DataResult<List<City>> getAll() {
        return this.cityService.getAll();
    }





}
