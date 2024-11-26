package linkedList;

public class Circular_Linked_List
{
    Node root,last;

    void create_List()
    {
        root=last=null;
    }
    void insert_left(int data)
    {
        Node n=new Node(data);
        if(root==null) {
            root =last= n;//first
            last.next=root;
        }
        else
        {
            n.next=root;//1
            root=n; //2
            last.next=root;//3
        }
        System.out.println(data+" inserted");
    }
    void delete_left()
    {

        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Node t=root;//1
            if(root==last)//single node
            {
                root=last=null;//manual reset
            }
            else
            {
                 root=root.next;//2
                last.next=root;//3
            }

            System.out.println(t.data+" deleted");//3
        }

    }
    void insert_right(int data)
    {
        Node n=new Node(data);
        if(root==null)
        {
            root =last= n;//first
            last.next=root;
        }
        else
        {
          last.next=n;//1
          last=n;//2
          last.next=root;//3
        }
        System.out.println(data+" inserted");
    }
    void delete_right()
    {

        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Node t=root;//1
            Node t2=root;//1
            while(t.next!=root)//2
            {
                t2=t;
                t=t.next;
            }
            if(root==t)
                root=last=null;//manual reset
            else {
                last=t2;//3
                last.next=root;//4
            }
            System.out.println(t.data+" deleted");//3
        }
    }
    void print_list()
    {
        if(root==null)
            System.out.println("\nList Empty");
        else
        {
            Node t=root;//1
            do
            {
                System.out.print("|"+t.data+"|->");
                t=t.next;
            }while(t!=root);//2
        }
    }
}