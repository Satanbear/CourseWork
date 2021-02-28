package test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import test.model.Paradigm;
import test.model.Language;
import test.model.Realization;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IController {

    public List<Paradigm> getAllParadigms() throws IOException, SQLException;
    public List<Language> getAllLanguages() throws IOException, SQLException;
    public List<Realization> getAllRealizations() throws IOException, SQLException;

    public void addParadigm(@RequestBody Paradigm paradigm) throws IOException, SQLException;
    public void addLanguage(@RequestBody Language language) throws IOException, SQLException;
    public void addRealization(@RequestBody Realization realization) throws IOException, SQLException;

    public void deleteParadigm(@PathVariable("idParadigm") int idParadigm) throws IOException, SQLException;
    public void deleteLanguage(@PathVariable("idLanguage") int idLanguage) throws IOException, SQLException;
    public void deleteRealization(@PathVariable("idRealization") int idRealization) throws IOException, SQLException;

    public void updateParadigm(@PathVariable("idParadigm") int idParadigm, @RequestBody Paradigm paradigm) throws IOException, SQLException;
    public void updateLanguage(@PathVariable("idLanguage") int idLanguage, @RequestBody Language language) throws IOException, SQLException;
    public void updateRealization(@PathVariable("idRealization") int idRealization, @RequestBody Realization realization) throws IOException, SQLException;

}
