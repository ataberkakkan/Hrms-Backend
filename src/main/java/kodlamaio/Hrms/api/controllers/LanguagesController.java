package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.business.abstracts.LanguageService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Language language){
        return this.languageService.add(language);
    }

    @GetMapping("/getall")
    public DataResult<List<Language>> getAll(){
        return this.languageService.getAll();
    }
}
