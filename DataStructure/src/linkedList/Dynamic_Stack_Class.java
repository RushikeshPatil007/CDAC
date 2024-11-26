package linkedList;

public class Dynamic_Stack_Class
{
    Node tos;

    void create_stack()
    {
        tos=null;
    }
    void push(int data)
    {
        Node n=new Node(data);
        if(tos==null)
            tos=n;//first
        else
        {
            n.next=tos;//1
            tos=n; //2
        }
        System.out.println(data+" pushed");
    }
    void pop()
    {

        if(tos==null)
            System.out.println("\nStack Empty");
        else
        {
            Node t=tos;//1
            tos=tos.next;//2
            System.out.println(t.data+" poped");//3
        }

    }
    void peek()
    {

        if(tos==null)
            System.out.println("\nStack Empty");
        else
        {
            System.out.println(tos.data+" @ peek");//3
        }

    }
    void print_stack()
    {
        if(tos==null)
            System.out.println("\nStack Empty");
        else
        {
            Node t=tos;//1
            while(t!=null)//2
            {
                System.out.print("\n"+t.data);
                System.out.print("\n-----");
                t=t.next;
            }
        }
    }
}