package assignment3;

import java.util.Scanner;

public class EmployeeManagmentMain {
	public static void main(String[]args) {
	EmployeeManagment emp=new EmployeeManagment();
   Scanner sc=new Scanner(System.in);
   int ch;
   do{
	   System.out.println("\n1.Insert record");
	   System.out.println("\n2.Delete record");
	   System.out.println("\n3.Print record");
	   System.out.println("\n4.Exit");
	   System.out.println("\nChoice");
	   ch=sc.nextInt();
	   switch(ch) {
	   case 1:
		    System.out.println("Enter id");
		    int id=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter Name");
		    String Name=sc.nextLine();
		    System.out.println("Enter Gender");
		    String Gender=sc.nextLine();
		    System.out.println("Enter Salary");
		    int Salary=sc.nextInt();
		    emp.insertRecord(id,Name, Gender, Salary);
		    //System.out.println("Record inserted");
		    break;
	   case 2:
		   System.out.println("Enter Emloyee Id");
		   id=sc.nextInt();
		   emp.deleteRecord(id);
		   break;
	   case 3:
		   System.out.println("All Emplyees Records");
		   emp.printrecords();
		   break;
	   case 4:
		   System.out.println("Exit");
		   break;
	   default :
		   System.out.println("Wrong Option is selected");
		   break;
	   }
   }while(ch!=0);
   sc.close();
   
}
}
