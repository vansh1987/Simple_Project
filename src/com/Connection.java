package com;
import java.sql.*;

public class Connection {

   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
   java.sql.Connection conn = null;
   Statement stmt = null;
   
   //public static void main(String[] args)
   public void connectionSql()
   { 
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);

      //STEP 4: Execute a query
      System.out.println("Creating database...");
      stmt = conn.createStatement();
      
      String sql = "CREATE DATABASE IF NOT EXISTS demo";
      stmt.executeUpdate(sql);
      System.out.println("Database created successfully...");
      
      stmt = conn.createStatement();
      String sqlSelect = "USE demo;";
      stmt.executeUpdate(sqlSelect);
      System.out.println("DATABASE IS SELECTED");
     
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
   /*
   finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }
      catch(SQLException se)
      {
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
   */
}//end connectionSql
   
   public void insertRecord()
   {
	   try
	   {
	   System.out.println("Inserting records into the table...");
	      stmt = conn.createStatement();
	      
	      String sql = "INSERT INTO COURSE " +
	                   "VALUES (?, ?)";
	      stmt = conn.prepareStatement(sql);
	    //  stmt.setString(1, course_code.getText());
	      
	   // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(sql);
	      preparedStmt.setString (1, "Barney");
	      preparedStmt.setString (2, "Rubble");
	      stmt.executeUpdate(sql);
	   
	      System.out.println("Inserted records into the table...");

	   }// end try
   catch(SQLException se)
	   {
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }
   }
   
   public void createTable()
   {
	   try
	   {
	   System.out.println("Creating table in given database...");
	      stmt = conn.createStatement();
	      
	      String sql = "CREATE TABLE IF NOT EXISTS COURSE " +
	                   "(course_code VARCHAR(50) NULL, " +
	                   " course_name VARCHAR(255)";

	      stmt.executeUpdate(sql);
	      System.out.println("Created table in given database...");
	   } // end try
	   
	   catch(SQLException se)
	   {
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }
   }
}//end Connection