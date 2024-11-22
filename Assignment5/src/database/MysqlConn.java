package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MysqlConn {
  public static void main(String[] args) {
	  Statement stmt=null;
	  try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment5","root","root");
		
		//System.out.println("Connected....");
		stmt =connection.createStatement();	
		String sql="Select * from employee";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			int id=rs.getInt("empId");
			String first=rs.getString("name");
			int sal=rs.getInt("salary");
			
			System.out.println("Id is "+id);
			System.out.println("Name is "+first);
			System.out.println("Salary is "+sal);
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Error to connect mysql");
	}
  }
}
