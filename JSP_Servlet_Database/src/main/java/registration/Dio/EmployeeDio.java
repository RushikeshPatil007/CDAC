package registration.Dio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import registration.model.Employee;

public class EmployeeDio {

	public int registerEmployee(Employee employee) throws ClassNotFoundException{
		String INSERT_USERS_SQL = "INSERT INTO employee" +
				" (id,first_name,last_name,username,password,address,contact)VALUES"+
				"(?, ?, ?, ?, ?, ?, ?)";
		
		//String checkQuery = "SELECT COUNT(*) FROM employee WHERE id = ?";
		int result=0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection connection =DriverManager
				.getConnection("jdbc:mysql://localhost:3307/employees?useSSL=false","root","root");
		
		PreparedStatement preparedstatement=connection.prepareStatement(INSERT_USERS_SQL)){
				
		preparedstatement.setInt(1,1);
		preparedstatement.setString(2,employee.getFirst_name());
		preparedstatement.setString(3,employee.getLast_name());
		preparedstatement.setString(4,employee.getUsername());
		preparedstatement.setString(5,employee.getPassword());
		preparedstatement.setString(6,employee.getContact());
		preparedstatement.setString(7,employee.getAddress());
		System.out.println(preparedstatement);
         
         result = preparedstatement.executeUpdate();

     } catch (SQLException e) {
	    printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
		}
	
}
