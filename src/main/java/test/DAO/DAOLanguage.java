package test.DAO;

import org.springframework.stereotype.Component;
import test.model.Language;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class DAOLanguage {

    public List getAll() {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            ResultSet resultSet =
                    connection.createStatement().executeQuery("SELECT * FROM \"Language\" ORDER BY \"idLanguage\" ASC");
            List list = new ArrayList();
            while (resultSet.next()) {
                list.add(new Language(
                        resultSet.getInt("idLanguage"),
                        resultSet.getString("nameLanguage"),
                        resultSet.getString("nameParadigm"),
                        resultSet.getString("level"),
                        resultSet.getString("type")));
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    public Language getByID(int idLanguage) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM \"Language\" WHERE \"idLanguage\" = ?");
            preparedStatement.setInt(1, idLanguage);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return new Language(
                    resultSet.getInt("idCLanguage"),
                    resultSet.getString("nameLanguage"),
                    resultSet.getString("nameParadigm"),
                    resultSet.getString("level"),
                    resultSet.getString("type"));
        } catch (SQLException e) {
            return null;
        }
    }

    public void insert(Language language) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO \"Language\" (\"nameLanguage\", \"nameParadigm\", \"level\", \"type\") VALUES (?,?,?,?)");
            preparedStatement.setString(1, language.getNameLanguage());
            preparedStatement.setString(2, language.getNameParadigm());
            preparedStatement.setString(3, language.getLevel());
            preparedStatement.setString(4, language.getType());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return;
        }
    }

    public void update(Language language, int idLanguage) {
        Connection connection = null;
        try {
            connection = ConnectionJDBC.getConnect();
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            String sql = "UPDATE \"Language\" " +
                    "SET " +
                    "\"nameLanguage\" = '"+ language.getNameLanguage() + "'," +
                    "\"nameParadigm\" = '"+ language.getNameParadigm() + "'," +
                    "\"level\" = '"+ language.getLevel() + "'," +
                    "\"type\" = '"+ language.getType() + "' WHERE \"idLanguage\" = "+idLanguage+""
                    ;
            statement.execute(sql);
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int idLanguage) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("DELETE FROM \"Language\"  WHERE  \"idLanguage\" = ?");
            preparedStatement.setInt(1, idLanguage);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return;
        }
    }

    public List getLanguagesFromOOP() {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            ResultSet resultSet =
                    connection.createStatement().executeQuery("select FC.\"nameLanguage\" from \"Language\" FC inner join \"Paradigm\" FL on FC.\"nameParadigm\" = FL.\"nameParadigm\"\n" +
                            "where FL.\"nameLanguage\" = 'ООП'");
            List list = new ArrayList();
            while (resultSet.next()) {
                list.add(new Language(
                        resultSet.getString("nameLanguage")));
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }
}
