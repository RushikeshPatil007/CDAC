package rushikesh007;

import java.util.ArrayList;

public class EmployeeService {
  
	static ArrayList<Employee> fetchemployee() throws Exception{
		ArrayList<Employee> al=EmployeeDao.fetchemployee();
		
		for(Employee emp : al) {
			if(emp.name.startsWith("R")) {
				System.out.println(emp);
			}
		}
		return al;
	}
}

