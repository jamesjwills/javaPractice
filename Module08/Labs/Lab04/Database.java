import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Main class
 */
public class Database {

    /**
     * @param args the command line arguments
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("SQL SERVER DATABASE EXAMPLE");
        System.out.println("===========================");

        // The function createConnection() will create a connection for you

        // 1 - Write a function that will take an authorId as a string and print
        //     a couple of columns from the matching author.  You SHOULD use
        //     a PreparedStatement and an SQL parameter to do this
        //     Test it by calling it from main


        // 2 - Write a function that will insert a new author with the author id
        //     999-99-9999 make up values for the other columns
        //     You should check that the number of rows inserted is one.
        //     Test this function by calling it from main
        //     What happens the second time you try to insert the row?


        // 3 - Write a function that will delete an author.  It should receive the 
        //     author id as a parameter.  You SHOULD use a PreparedStatement and an 
        //     SQL parameter to do this
        //     Test it by calling it from main.  Call it before your insert function
        //     So that the insert can work every time

    

        // 4 - Write a function that will update an author.  It should receive the
        //     author id as a parameter.  You should use a prepared statement and
        //     an SQL parameter for the WHERE clause.  You can hard code some update
        //     values.  Using more parameters for the update values is a bonus




        System.out.println("Program completed...");

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




}