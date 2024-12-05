package wellness;

import java.util.Scanner;

public class Stack_Wellness {
    static boolean check_balance(String word)
    {
        int g;
        Stack_Class obj = new Stack_Class();
        obj.create_stack(word.length());
        for(int i=0;i<word.length();i++)
        {
            if('{'==word.charAt(i))
                obj.push(word.charAt(i));
            else if (!obj.is_empty() &&'}'==word.charAt(i))
                g=obj.pop();
            else
                return false;

        }
         return obj.is_empty();
    }


    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string:");
        String word = in.next();
        System.out.println("given data is balanced:" + check_balance(word));
    }
}

