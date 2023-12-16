
## Parameterised queries and updates

 The function createConnection() will create a connection for you

1. Write a function that will take an authorId as a string and print a couple of columns from the matching author.  You SHOULD use a PreparedStatement and an SQL parameter to do this.

    Test it by calling it from main


2. Write a function that will insert a new author with the author id 999-99-9999 make up values for the other columns. You should check that the number of rows inserted is one.   Test this function by calling it from main What happens the second time you try to insert the row?


1. Write a function that will delete an author.  It should receive the author id as a parameter.  You SHOULD use a PreparedStatement and an SQL parameter to do this. Test it by calling it from main.  Call it before your insert function so that the insert can work every time

 

1. Write a function that will update an author.  It should receive the author id as a parameter.  You should use a prepared statement and an SQL parameter for the WHERE clause.  You can hard code some update values.  Using more parameters for the update values is a bonus

