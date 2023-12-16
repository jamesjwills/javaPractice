
## Join Queries


### Suggestions for join queries

Continue working in the `pubs` database

1) For each title look up the name of the publisher from the publishers table. Display the title_id, title and the publisher name
2) Add the publisher's id number.
3) select from the sales table, show the ordernumber and the quantity.  Also show the name of each title, the publisher for the title
   and the name of the store.  To do this you will need several joins.  Build the query in stages.  Start with sales joined to stores, to 
   get the store name. Add in titles to get the title. Then add in publishers to get the publisher name

   You can use Management Studio's tree view (the left hand window) to drill down into a table and determine the columns
4) select from the sales table, showing the total sales for each title
5) select from the sales table, showing the total sales for each title per store
6) Use a join to include the title from the titles table into #5
7) And another join to include the publisher name from the publisher table

