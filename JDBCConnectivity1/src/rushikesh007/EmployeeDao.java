package rushikesh007;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

public class EmployeeDao {
  
	static ArrayList <Employee> fetchemployee() throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	
		String sql="select *from employee";
		
		Statement s=(Statement) c.createStatement();
		ResultSet r=s.executeQuery(sql);
		ArrayList<Employee> als=new ArrayList<Employee>();
		while(r.next()) {
			int id=r.getInt(1); 
			String name=r.getString(2);
			double salary=r.getDouble(3);
			Employee emp=new Employee(id, name,salary);
			als.add(emp);
			System.out.println("id"+id);
			System.out.println("name"+name);
			System.out.println("salary"+salary);
		}
		return als;
		
		
	}
}


