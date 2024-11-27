package assignment3;

public class EmployeeManagment {
    Employee root;
    
    public EmployeeManagment() {
    	this.root=null;
    }
    
   public void insertRecord(int id,String Name,String Gender, int Salary) {
    	Employee n=new Employee(id,Name,Gender,Salary);
    	 if(root==null)
    		 root=n;
    	 else {
    		 n.next=root;
    		 root=n;
    	}
    	 System.out.println(id+" "+Name+" "+Gender+" "+Salary+ "\nRecord is Inserted");
   }
    
    public void deleteRecord(int id) {
    	if(root==null)
    System.out.println("Empty Record");
    else {
    	Employee t=root;
    	root=root.next;
    	System.out.println(t.id+"Deleted");
    }
    
}
    
    public void printrecords() {
    	//Employee temp=root;
    	if(root==null)
    		System.out.println("Record is Empty");
    	else {
    		Employee t=root;
    		while(t!=null) {
    			System.out.print("Id:"+t.id+"Name:"+t.Name+"Gender:"+t.Gender+"Salary"+t.salary+"|->");
    			t=t.next;
    		}
    	}
    }
}
