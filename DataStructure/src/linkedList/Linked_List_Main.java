package linkedList;

import java.util.Scanner;

public class Linked_List_Main
{
    public static void main(String args[]) {
        //Linear_Linked_List obj = new Linear_Linked_List();
       // Circular_Linked_List obj=new Circular_Linked_List();
        Doubly_Linked_List obj=new Doubly_Linked_List();
        Scanner in = new Scanner(System.in);
        int ch, e;
        obj.create_List();//creating LinkedList
        do {
            System.out.print("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print");
            System.out.print("\n6.Print reverse :");
            System.out.print("\n0.Exit :");
            System.out.print("\nChoice:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_left(e);
                    System.out.println("Element Inserted");
                    break;

                case 2:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_right(e);
                    System.out.println("Element Inserted");
                    break;

                case 3:
                    obj.delete_left();
                    break;

                case 4:
                    obj.delete_right();
                    break;
                case 5:
                    obj.print_list();
                    break;
                case 6:
                    obj.print_list_rev();
                    break;
                case 0:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Wrong option selected");
                    break;
            }

        } while (ch != 0);
        in.close();
    }
}
