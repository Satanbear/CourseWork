package test.DAO;

import org.springframework.stereotype.Component;
import test.model.Realization;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class DAORealization {

    public List getAll() {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            ResultSet resultSet =
                    connection.createStatement().executeQuery("SELECT * FROM \"Realization\"");
            List list = new ArrayList();
            while (resultSet.next()) {
                list.add(new Realization(
                        resultSet.getInt("idRealization"),
                        resultSet.getString("nameLanguage"),
                        resultSet.getString("nameRealization"),
                        resultSet.getString("compile")));
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    public Realization getByID(int idRealization) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT * FROM \"Realization\" WHERE \"idRealization\" = ?");
            preparedStatement.setInt(1,idRealization);
            ResultSet resultSet=preparedStatement.executeQuery();
            resultSet.next();
            return new Realization(
                    resultSet.getInt("idRealization"),
                    resultSet.getString("nameLanguage"),
                    resultSet.getString("nameRealization"),
                    resultSet.getString("compile"));
        } catch (SQLException e) {
            return null;
        }
    }

    public void insert(Realization realization) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("INSERT INTO \"Realization\" (\"nameLanguage\", \"nameRealization\", \"compile\") VALUES (?,?,?)");
            preparedStatement.setString(1, realization.getNameLanguage());
            preparedStatement.setString(2, realization.getNameRealization());
            preparedStatement.setString(3, realization.getCompile());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return;
        }
    }

    public void update(Realization realization, int idRealization) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("UPDATE \"Realization\" SET  \"nameLanguage\" = ?, \"nameRealization\" = ?, \"compile\" = ? WHERE  \"idRealization\" = ?");
            preparedStatement.setString(1, realization.getNameLanguage());
            preparedStatement.setString(2, realization.getNameRealization());
            preparedStatement.setString(3, realization.getCompile());
            preparedStatement.setInt(4, idRealization);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return;
        }
    }

    public void delete(int idRealization) {
        try (Connection connection = ConnectionJDBC.getConnect()) {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("DELETE FROM \"Realization\"  WHERE  \"idRealization\" = ?");
            preparedStatement.setInt(1, idRealization);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            return;
        }
    }
}
