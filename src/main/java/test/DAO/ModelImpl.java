package test.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.model.Paradigm;
import test.model.Language;
import test.model.Realization;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Component
public class ModelImpl implements ModelDAO {
    @Autowired
    DAOParadigm paradigms;

    @Autowired
    DAOLanguage languages;

    @Autowired
    DAORealization realizations;

    public ModelImpl(DAOParadigm paradigm, DAOLanguage language, DAORealization realization) {
        this.paradigms = paradigm;
        this.languages = language;
        this.realizations = realization;
    }

    public ModelImpl() {
    }

    @Override
    public List<Paradigm> getParadigms() throws SQLException, IOException {
        return paradigms.getAll();
    }
    @Override
    public List<Language> getLanguages() throws SQLException, IOException {
        return languages.getAll();
    }
    @Override
    public List<Realization> getRealizations() throws SQLException, IOException {
        return realizations.getAll();
    }

    @Override
    public void updateParadigm(int idParadigm, Paradigm paradigm) throws IOException, SQLException {
        paradigms.update(idParadigm, paradigm);
    }
    @Override
    public void updateLanguage(Language language, int idLanguage) throws IOException, SQLException {
        languages.update(language, idLanguage);
    }
    @Override
    public void updateRealization(Realization realization, int idRealization) throws IOException, SQLException {
        realizations.update(realization, idRealization);
    }

    @Override
    public void addParadigm(Paradigm paradigm) throws IOException, SQLException {
        paradigms.insert(paradigm);
    }
    @Override
    public void addLanguage(Language language) throws IOException, SQLException {
        languages.insert(language);
    }
    @Override
    public void addRealization(Realization realization) throws IOException, SQLException {
        realizations.insert(realization);
    }

    @Override
    public void delParadigm(int idParadigm) throws IOException, SQLException {
        paradigms.delete(idParadigm);
    }
    @Override
    public void delLanguage(int idLanguage) throws IOException, SQLException {
        languages.delete(idLanguage);
    }
    @Override
    public void delRealization(int idRealization) throws IOException, SQLException {
        realizations.delete(idRealization);
    }

    @Override
    public Paradigm getParadigmById(int idParadigm) throws IOException, SQLException {
        return paradigms.getByID(idParadigm);
    }
}
