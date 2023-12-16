
## Send queries from Java

1. NOTE1.........

   Before this will run you will need to create a user for the `JavaUser` account in the pubs database.

   Paste these lines into SQL Server Management Studio and run them... (Take any Java comments off the front first!)

    USE [pubs]
    GO
    /****** Object:  User [JavaUser]    Script Date: 27/04/2022 21:59:01 ******/
    CREATE USER [JavaUser] FOR LOGIN [JavaUser] WITH DEFAULT_SCHEMA=[dbo]
    GO
    ALTER ROLE [db_owner] ADD MEMBER [JavaUser]
    GO

1. NOTE2.........
A driver for sql server is already installed.  It is in the Module08 Tools directory
When you run your program specify this in the classpath
You'll probably want to copy/paste it!
`..\..\Tools\sqljdbc_10.2.0.0_enu\sqljdbc_10.2\enu\mssql-jdbc-10.2.0.jre11.jar` 
1 - Use a try with resources to create a `Connection` using the connection string above
2 - Nest another try with resources to create a `Statement`
3 - Nest another try with resources to execute the query `select * from authors`
4 - iterate the query results by calling `next` in a while loop
5 - inside the while loop display the `au_id` and the `au_lname`
6 - experiment with displaying more columns


