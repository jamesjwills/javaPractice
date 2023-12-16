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

        String connectionURL = "jdbc:sqlserver://localhost;"
                + "database=pubs;"
                + "user=JavaUser;password=abc1234$;"
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=5";

        // NOTE1.........
        // Before this will run you will need to create a user for the JavaUser account
        // in the pubs database.
        // Paste these lines into SQL Server Management Studio and run them... 
        // (Take the Java comments off the front first!)
        // USE [pubs]
        // GO
        // /****** Object:  User [JavaUser]    Script Date: 27/04/2022 21:59:01 ******/
        // CREATE USER [JavaUser] FOR LOGIN [JavaUser] WITH DEFAULT_SCHEMA=[dbo]
        // GO
        // ALTER ROLE [db_owner] ADD MEMBER [JavaUser]
        // GO




        // NOTE2.........
        // A driver for sql server is already installed.  It is in the Module08 Tools directory
        // When you run your program specify this in the classpath
        // You'll probably want to copy/paste it!
        // ..\..\Tools\sqljdbc_10.2.0.0_enu\sqljdbc_10.2\enu\mssql-jdbc-10.2.0.jre11.jar 

        // 1 - Use a try with resources to create a Connection using the connection string above

        // 2 - Nest another try with resources to create a Statement

        // 3 - Nest another try with resources to execute the query select * from authors

        // 4 - iterate the query results by calling next in a while loop

        // 5 - inside the while loop display the au_id and the au_lname

        // 6 - experiment with displaying more columns



        
        System.out.println("Program completed...");

    }

}