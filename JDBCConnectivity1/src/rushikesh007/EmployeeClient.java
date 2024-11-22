package rushikesh007;

import java.util.ArrayList;

public class EmployeeClient {

	public static void main(String[] args) throws Exception {
		ArrayList<Employee>al=EmployeeController.fetchemployee();
		for(Employee emp:al) {
			System.out.println(emp);
		}

	}

}
