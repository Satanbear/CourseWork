package test.DAO;

import org.springframework.stereotype.Component;
import test.model.Paradigm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class DAOParadigm {

    public List getAll() {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            Statement statement = connection.createStatement();
            statement.setFetchSize(1);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM \"Paradigm\" ORDER BY \"idParadigm\" DESC");

//            ResultSet resultSet =
//                    connection.createStatement().executeQuery("SELECT * FROM \"Paradigm\" ORDER BY \"idParadigm\" DESC");
            List list = new ArrayList();
            while (resultSet.next()) {
                list.add(new Paradigm(
                        resultSet.getInt("idParadigm"),
                        resultSet.getString("nameParadigm")));
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    public Paradigm getByID(int idParadigm) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM \"Paradigm\" WHERE \"idParadigm\" = ?");
            preparedStatement.setInt(1, idParadigm);
            ResultSet resultSet=preparedStatement.executeQuery();
            resultSet.next();
            return new Paradigm(
                    resultSet.getString("nameParadigm"));
        } catch (SQLException e) {
            return null;
        }
    }

    public void insert(Paradigm paradigm) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO \"Paradigm\" (\"nameParadigm\") VALUES (?)");
            preparedStatement.setString(1, paradigm.getNameParadigm());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return;
        }
    }

    public void update(int idParadigm, Paradigm paradigm) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("UPDATE \"Paradigm\" SET \"nameParadigm\" = ? WHERE  \"idParadigm\" = ?");
            preparedStatement.setString(1, paradigm.getNameParadigm());
            preparedStatement.setInt(2, idParadigm);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return;
        }
    }

    public void delete(int idParadigm) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("DELETE FROM \"Paradigm\"  WHERE  \"idParadigm\" = ?");
            preparedStatement.setInt(1, idParadigm);
            preparedStatement.executeUpdate();

            Statement s = connection.createStatement();;
            s.addBatch("SET FOREIGN_KEY_CHECKS = 0");
            s.addBatch("DELETE FROM \"Paradigm\"  WHERE  \"idParadigm\" = ?");
            s.addBatch("DELETE FROM \"Language\"  WHERE  \"idLanguage\" = ?");
            s.addBatch("SET FOREIGN_KEY_CHECKS = 1");
            s.executeBatch();

        } catch (SQLException e) {
            return;
        }
    }
}

