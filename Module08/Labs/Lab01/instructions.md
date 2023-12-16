
## Simple SQL Queries

1. Install the `pubs` database
    - Open the file `instpubs.sql`
    - Feel free to take a look at it, 
    - it's a mix of DDL (to create tables and other objects - including objects not mentioned in this course) and DML to insert sample data
    - execute the whole file (press F5).  It takes a few seconds to run
1. Now write some queries of your own.  Here are some suggestions. Have a go at the suggestions; when you have done them; experiment!
1. FIRST switch to processing the `pubs` database - click the dropdown near the top left and choose the `pubs` database
1. Now click the `New Query` button. You can run your queries by clicking `Execute` or pressing F5

### Suggested Queries
1. Retrieve every column of every row from the `titles` table
2. Retrieve just `title_id`, and `title` for all books with an `advance` of 5000
3. Retrieve all books with the `type` psychology
4. Retrieve all books with the `type` psychology and an `advance` greater than 5000
5. Retrieve all books with an `advance` greater than 5000...
   In a separate sql query retrieve all those with an `advance` <= 5000
   These two should return 16 rows between them, yet there are 18 in the table
   Why are two missing?
6. Calculate the year to date royalties on each book.  The `royalty` column in the table
   is the percentage paid to the author.  Display the `title_id`, the `title` and the calculated result


