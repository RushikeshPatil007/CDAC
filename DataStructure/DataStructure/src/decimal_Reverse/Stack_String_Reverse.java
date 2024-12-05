package decimal_Reverse;

import java.util.Scanner;

public class Stack_String_Reverse {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Stack_Class obj = new Stack_Class();
        obj.create_stack(64);//4
        //i/p
        System.out.println("Enter enter to reverse:");
        int num=in.nextInt();//java
        
       
        
        while(num!=0)//a v a j
        {
            obj.push(num%2);
            num/=2;
        }
        System.out.println("number in bin is");
        
    }
}

