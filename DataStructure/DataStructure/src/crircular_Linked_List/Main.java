                package crircular_Linked_List;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Linear_Linked_List obj = new Linear_Linked_List();
        
        
        int choice;
        
        obj.create_List();     
        do {
            System.out.print("\nLinked List");
            System.out.print("\n-----------");
            System.out.print("\n1.insert left");
            System.out.print("\n2.delete left");
            System.out.print("\n3.insert right");
            System.out.print("\n4.delete right");
            System.out.print("\n5.Print list");
            System.out.print("\n6.delete element");
            System.out.print("\n7.insert after element");
            
            System.out.print("\n0.Exit");
            System.out.print("\nchoice:");
            
            choice = in.nextInt();
            
            switch (choice) {
                case 1:
                   
                        System.out.print("\nEnter element:");
                        int e = in.nextInt();
                        obj.insert_left(e); 
                    break;
                case 2:
                      
                        obj.delete_left();
                    
                    break;
                case 3:
                	System.out.print("\nEnter element:");
                     e = in.nextInt();
                    obj.insert_right(e); 
                    
                case 4:
                	obj.delete_right();  
                      break;
                case 5:
                	obj.print_list();
                	break;
                case 6:
                	System.out.print("\nEnter element:");
                    e = in.nextInt();
                   obj.delete_element(e);
                case 7:
                    
                    System.out.print("\nEnter element:");
                     e = in.nextInt();
                     int b=in.nextInt();
                    obj.insert_after(b,e); 
                break;
                case 0:
                    System.out.print("\nExiting code...bye");
                    break;
                    
                default:
                    System.out.print("\nWrong option selected..");
                    break;
            }
        } while (choice != 0);
        in.close();
    }
	
}
