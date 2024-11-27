package assignment3;

public class Employee {
	int id;
	String Name;
	String Gender;
	int salary;
	Employee next;
	
	Employee(int id,String Name,String Gender,int salary){
		this.id=id;
		this.Name=Name;
		this.Gender=Gender;
		this.salary=salary;
		this.next=null;
	}
}
