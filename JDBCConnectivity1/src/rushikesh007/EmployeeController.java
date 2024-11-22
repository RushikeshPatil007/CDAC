package rushikesh007;

import java.util.ArrayList;

public class EmployeeController {
   static ArrayList<Employee> fetchemployee() throws Exception{
	   ArrayList<Employee> alst=EmployeeService.fetchemployee();
	   return alst;
   }

}