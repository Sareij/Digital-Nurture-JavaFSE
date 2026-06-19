import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Exercise 31 - JDBC Student Viewer
 * Objective:
 * Connect to a database and retrieve student records.
 */

public class Exercise31_JdbcStudentViewer {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "sar1";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(
                            url,
                            username,
                            password);

            Statement statement =
                    connection.createStatement();

            String query = "SELECT * FROM students";

            ResultSet resultSet =
                    statement.executeQuery(query);

            System.out.println("Student Records");

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println(
                        id + " | "
                                + name + " | "
                                + age);

            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {

            System.out.println(
                    "Error: "
                            + e.getMessage());

        }

    }
}