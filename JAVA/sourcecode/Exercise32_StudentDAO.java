import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exercise32_StudentDAO {

    private static final String url = "jdbc:mysql://localhost:3306/studentdb";
    private static final String username = "root";
    private static final String password = "sar1";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    // INSERT OPERATION
    public static void insertStudent(int id, String name, int age) {

        String query = "INSERT INTO students VALUES (?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            int rows = ps.executeUpdate();
            System.out.println("Inserted Rows: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE OPERATION
    public static void updateStudent(int id, String name, int age) {

        String query = "UPDATE students SET name=?, age=? WHERE id=?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();
            System.out.println("Updated Rows: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        insertStudent(105, "Kiran", 23);
        updateStudent(105, "Kiran Kumar", 24);
    }
}