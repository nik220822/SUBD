import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/NickDB", "root", "deleted");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from NickDB.PERSONS where age>27 order by age DESC");
            while (resultSet.next()) {
                System.out.printf("%s %s %n", resultSet.getString("name"), resultSet.getString("surname"));
            }
        } catch (Exception e) {
        }
    }
}
