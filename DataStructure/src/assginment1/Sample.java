package assginment1;

import java.util.Scanner;

public class Sample {
	 
	 
	  public static int precedence(char a){
	    switch(a){
	      case '^':
	        return 3;
	      case '/':
	      case '*':
	        return  2;
	      case '+':
	      case '-':
	        return 1;
	      default:
	        return 0;
	    }
	  }
	    public static void main(String[] args) {
	   
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a String");
	    String str = sc.next();
	    char s[]=new char[str.length()];
	    char chh[]=new char[str.length()];
	    int m=0,n=0;
	    for (int i=0;i<str.length();++i)
	    {
	      char ch = str.charAt(i);
	      if (ch == '+' || ch == '^'|| ch == '-'|| ch == '/'|| ch == '*'){
	        int current = precedence(ch);
	        int prvious = precedence(chh[m]);
	        if(ch>prvious){
	        chh[m++] = ch;
	        }else{
	          char r = chh[m--];
	          s[n++]=r;
	        }
	      } else{
	        s[n++] = ch;
	      }
	    }
	    while(m>0){
	      s[n++]=chh[--m];
	    }
	    sc.close();
	    for(int i=0;i<=10;i++ ) {
	    System.out.print(s[i]);
	    }
	  }
	}

