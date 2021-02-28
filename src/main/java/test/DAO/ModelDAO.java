package test.DAO;

import test.model.Paradigm;
import test.model.Language;
import test.model.Realization;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface ModelDAO {
    List<Paradigm> getParadigms() throws SQLException, IOException;
    List<Language> getLanguages() throws SQLException, IOException;
    List<Realization> getRealizations() throws SQLException, IOException;

    void updateParadigm(int idParadigm, Paradigm paradigm) throws IOException, SQLException;
    void updateLanguage(Language language, int idLanguage) throws IOException, SQLException;
    void updateRealization(Realization realization, int idRealization) throws IOException, SQLException;

    void addParadigm(Paradigm paradigm) throws IOException, SQLException;
    void addLanguage(Language language) throws IOException, SQLException;
    void addRealization(Realization realization) throws IOException, SQLException;

    void delParadigm(int idParadigm) throws IOException, SQLException;
    void delLanguage(int idLanguage) throws IOException, SQLException;
    void delRealization(int idRealization) throws IOException, SQLException;

    Paradigm getParadigmById(int idParadigm) throws IOException, SQLException;
}
