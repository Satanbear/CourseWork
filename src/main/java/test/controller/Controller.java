package test.controller;

import test.DAO.ModelImpl;
import test.model.Paradigm;
import test.model.Language;
import test.model.Realization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
public class Controller{

    @Autowired
    public ModelImpl model;

    @GetMapping(value = "/paradigmslist", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Paradigm> getAllParadigms() throws IOException, SQLException {
        return model.getParadigms();
    }
    @GetMapping("languages-list")
    public List<Language> getAllLanguages() throws IOException, SQLException {
        return model.getLanguages();
    }
    @GetMapping("realizations-list")
    public List<Realization> getAllRealizations() throws IOException, SQLException {
        return model.getRealizations();
    }

    @PostMapping(path = "/addParadigm")
    public void addParadigm(@RequestBody Paradigm paradigm) throws IOException, SQLException {
        model.addParadigm(paradigm);
    }
    @PostMapping("add-language")
    public void addLanguage(@RequestBody Language language) throws IOException, SQLException {
        model.addLanguage(language);
    }
    @PostMapping("add-realization")
    public void addRealization(@RequestBody Realization realization) throws IOException, SQLException {
        model.addRealization(realization);
    }

    @DeleteMapping("delete-paradigm/{idParadigm}")
    public void deleteParadigm(@PathVariable("idParadigm") int idParadigm) throws IOException, SQLException {
        model.delParadigm(idParadigm);
    }
    @DeleteMapping("delete-language/{idLanguage}")
    public void deleteLanguage(@PathVariable("idLanguage") int idLanguage) throws IOException, SQLException {
        model.delLanguage(idLanguage);
    }
    @DeleteMapping("delete-realization/{idRealization}")
    public void deleteRealization(@PathVariable("idRealization") int idRealization) throws IOException, SQLException {
        model.delRealization(idRealization);
    }

    @GetMapping("paradigm/{idParadigm}")
    public Paradigm getParadigmByID(@PathVariable("idParadigm") int idParadigm) throws IOException, SQLException {
        return model.getParadigmById(idParadigm);
    }

    @PostMapping("update-paradigm/{idParadigm}")
    public void updateParadigm(@PathVariable("idParadigm") int idParadigm, @RequestBody Paradigm paradigm) throws IOException, SQLException {
        model.updateParadigm(idParadigm, paradigm);
    }
    @PostMapping("update-language/{idLanguage}")
    public void updateLanguage(@PathVariable("idLanguage") int idLanguage, @RequestBody Language language) throws IOException, SQLException {
        model.updateLanguage(language, idLanguage);
    }
    @PostMapping("update-realization/{idRealization}")
    public void updateRealization(@PathVariable("idRealization") int idRealization, @RequestBody Realization realization) throws IOException, SQLException {
        model.updateRealization(realization, idRealization);
    }
}
