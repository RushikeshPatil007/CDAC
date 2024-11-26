package linkedList;

public class Dynamic_Queue
{
    Node front,rear;

    void create_queue()
    {
        rear=front=null;
    }

    void dequeue()
    {

        if(front==null)
            System.out.println("\nQueue Empty");
        else
        {

            Node t=front;//1
            if(front==rear)//single node case
                front=rear=null;//reset front rear
            else
                front=front.next;//2
            System.out.println(t.data+" dequeued");//3
        }

    }
    void enqueue(int data)
    {
        Node n=new Node(data);
        if(rear==null)
        {
            front=rear=n;//both on one
        }
        else
        {
            rear.next=n;
            rear=n;
        }
        System.out.println(data+" inserted");
    }

    void print_queue()
    {
        if(front==null)
            System.out.println("\nQueue Empty");
        else
        {
            Node t=front;//1
            while(t!=null)//2
            {
                System.out.print("|"+t.data+"|--");
                t=t.next;
            }
        }
    }
}