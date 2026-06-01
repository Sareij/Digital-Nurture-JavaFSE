import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exercise33_TransactionDemo {

    private static final String url = "jdbc:mysql://localhost:3306/bankdb";
    private static final String username = "root";
    private static final String password = "sar1";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    // MONEY TRANSFER METHOD
    public static void transferMoney(int fromId, int toId, double amount) {

        Connection conn = null;

        try {
            conn = getConnection();

            // 🚨 Start Transaction
            conn.setAutoCommit(false);

            // 1. Debit query
            String debitQuery = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            PreparedStatement debitPs = conn.prepareStatement(debitQuery);
            debitPs.setDouble(1, amount);
            debitPs.setInt(2, fromId);

            int debitResult = debitPs.executeUpdate();

            // 2. Credit query
            String creditQuery = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
            PreparedStatement creditPs = conn.prepareStatement(creditQuery);
            creditPs.setDouble(1, amount);
            creditPs.setInt(2, toId);

            int creditResult = creditPs.executeUpdate();

            // ✔ Check both operations
            if (debitResult > 0 && creditResult > 0) {
                conn.commit();
                System.out.println("✔ Transaction Successful - Money Transferred");
            } else {
                conn.rollback();
                System.out.println("❌ Transaction Failed - Rolled Back");
            }

        } catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("❌ Error Occurred - Transaction Rolled Back");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();

        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true);
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        // Transfer 1000 from Alice (1) to Bob (2)
        transferMoney(1, 2, 1000);
    }
}