package reverse_string;

import java.util.Scanner;

public class Stack_String_Reverse {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Stack_Class obj = new Stack_Class();
        //i/p
        System.out.println("Enter word to reverse:");
        String word=in.next();//java
        obj.create_stack(word.length());//4
        for(int i=0;i<word.length();i++)//start to end char char push
        {
           obj.push(word.charAt(i));//j a v a
        }
        String rword="";
        while(!obj.is_empty())//a v a j
        {
            rword=rword+(char)obj.pop();
        }
        System.out.println("Reversed string is:"+rword);
    }
}

