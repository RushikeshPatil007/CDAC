package linkedList;

import java.util.Scanner;

public class Stack_Main_prg
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Dynamic_Stack_Class obj=new Dynamic_Stack_Class();
        int choice;
        obj.create_stack();
        do
        {
            System.out.print("\nStack Menu");
            System.out.print("\n-----------");
            System.out.print("\n1.Push");
            System.out.print("\n2.Pop");
            System.out.print("\n3.Peek");
            System.out.print("\n4.Print Stack");
            System.out.print("\n0.Exit");
            System.out.print("\nchoice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                        System.out.print("\nEnter element:");
                        int e=in.nextInt();
                        obj.push(e);
                    break;
                case 2:
                       obj.pop();
                       break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.print_stack();
                    break;
                case 0:
                    System.out.print("\nExiting code...bye");
                    break;
                default:
                    System.out.print("\nWrong option selected..");
                    break;
            }
        }while(choice!=0);
        in.close();    }
}