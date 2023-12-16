import java.util.List;

import javax.swing.SortingFocusTraversalPolicy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Main class
 */
public class Run {

    /**
     * @param args the command line arguments
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("SQL SERVER STATEMENT EXAMPLES");
        System.out.println("======================================");

        Connection cn = createConnection();

        System.out.println("Connection createdx");

        displayAuthors();

        System.out.println("Using a prepared statement");
        displayAuthorsV4("172-32-1176");

        System.out.println("Making a delete");
        deleteAuthor("999-99-9999");
        
        System.out.println("Making an insert");
        addAuthor();

        updateAuthor("999-99-9999");

        deleteAuthor("999-99-9999");
    }

    public static Connection createConnection() throws SQLException {
        String connectionURL = "jdbc:sqlserver://localhost;"
                + "database=pubs;"
                + "user=JavaUser;password=abc1234$;"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=5";
        Connection connection = DriverManager.getConnection(connectionURL);
        return connection;

    }

    public static void displayAuthors() {
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = createConnection().createStatement();
            String sql = "select * from authors";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println();
                System.out.println(rs.getString("au_id"));
                System.out.println(rs.getString(2));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        return;
    }

    public static void displayAuthorsV2() throws SQLException {

        try (Connection cn = createConnection()) {
            try (Statement stmt = cn.createStatement()) {
                String sql = "select * from authors";
                try (ResultSet rs = stmt.executeQuery(sql)) {
                    while (rs.next()) {
                        System.out.println();
                        System.out.println(rs.getString("au_id"));
                        System.out.println(rs.getString(2));
                    }
                }
            }
        }
        return;
    }

    public static void displayAuthorsV3(String authorId) throws SQLException {

        try (Connection cn = createConnection()) {
            try (Statement stmt = cn.createStatement()) {
                String sql = "select * from authors where au_id = '" + authorId + "'";
                try (ResultSet rs = stmt.executeQuery(sql)) {
                    while (rs.next()) {
                        System.out.println();
                        System.out.println(rs.getString("au_id"));
                        System.out.println(rs.getString(2));
                    }
                }
            }
        }
        return;
    }

    public static void displayAuthorsV4(String authorId) throws SQLException {

        try (Connection cn = createConnection()) {
            String sql = "select * from authors where au_id = ?";
            try (PreparedStatement stmt = cn.prepareStatement(sql)) {
                stmt.setString(1, authorId);
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        System.out.println();
                        System.out.println(rs.getString("au_id"));
                        System.out.println(rs.getString(2));
                    }
                }
            }
        }
        return;
    }
    public static void addAuthor() throws SQLException {

        try (Connection cn = createConnection()) {
            // Typically the values are parameterized
            String sql = "insert authors(au_id, au_lname, au_fname, phone, address, contract)"
                                + " values('999-99-9999', 'Smith', 'Bill', '999 999-9999', '1 Acacia Avenue', 0)";
            try (PreparedStatement stmt = cn.prepareStatement(sql)) {
                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected != 1)
                    System.out.println("Expected to affect one row!");
            }
        }
        return;
    }
    public static void deleteAuthor(String authorId) throws SQLException {

        try (Connection cn = createConnection()) {
            String sql = "delete from authors"
                                + " where au_id = ?";
            try (PreparedStatement stmt = cn.prepareStatement(sql)) {
                stmt.setString(1, authorId);
                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected != 1)
                    System.out.println("Expected to affect one row!");
            }
        }
        return;
    }
    public static void updateAuthor(String authorId) throws SQLException {

        try (Connection cn = createConnection()) {
            // Typically the new values are parameterized
            String sql = "update authors set phone = '888 888-8888', city = 'anytown'"
                                + " where au_id = ?";
            try (PreparedStatement stmt = cn.prepareStatement(sql)) {
                stmt.setString(1, authorId);
                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected != 1)
                    System.out.println("Expected to affect one row!");
                  else
                    System.out.println("updated one row!");
            }
        }
        return;
    }
}