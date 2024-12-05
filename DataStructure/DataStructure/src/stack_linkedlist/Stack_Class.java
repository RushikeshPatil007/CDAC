package stack_linkedlist;


public class Stack_Class
{
   //data members
    int tos;
	private int[] stack;
    
   void create_stack(int size)
        {
            tos=null;
        }
    void push(int e)
    {
    	Node n=new Node (e);
        if(tos==null)
        tos=n;//stack[++tos]=e;
        else {
        	n.next=tos;
        	tos=n;
        }
        System.out.println(e + " inserted");
        
    }

    void pop()
    {
        if(tos==null)
        	System.out.println("\nList Empty");
        else {
			Node t = tos;// 1
			tos = tos.next;// 2
			System.out.println(t.data + " deleted");// 3
		}
    }
    int peek()
    {
        return(stack[tos]);
    }
//    boolean is_empty()
//    {
//        if(tos==-1)
//            return true;
//        else
//            return false;
//    }
    void print_stack()
    {
        for(int i=tos ;i>-1;i--)
            System.out.println(stack[i]);
    }




}