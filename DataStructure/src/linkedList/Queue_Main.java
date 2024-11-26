package linkedList;

import java.util.Scanner;

public class Queue_Main
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Dynamic_Queue obj=new Dynamic_Queue();
        int choice;
        obj.create_queue();
        do {
            System.out.print("\nQueue Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Enqueue");
            System.out.print("\n2.Dequeue");
            System.out.print("\n3.Print");
            System.out.print("\n0.Exit");
            System.out.print("\nchoice:");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                        System.out.print("\nEnter element:");
                        int e = in.nextInt();
                        obj.enqueue(e);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                        System.out.println("\nElements on queue");
                        obj.print_queue();
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
