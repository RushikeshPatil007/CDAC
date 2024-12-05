package queue;
public class Queue_Class
{
   //data members
 

   int front,rear,Maxsize,queue[];
    //function members
    void create_queue(int size)
    {
        front=0;
        rear=-1;
        Maxsize=size;
        queue=new int[Maxsize];
    }
    void enqueue(int e)
    {
        rear++;
        queue[rear]=e;
    }
    boolean is_full()
    {
        if(rear==Maxsize-1)
            return true;
        else
            return false;
    }
    int dequeue()
    {
        int temp=queue[front];
        front++;
        return(temp);
    }

    boolean is_empty()
    {
        if(front>rear)
            return true;
        else
            return false;
    }
    void print_queue()
    {
        for(int i=front ;i<=rear;i++)
            System.out.println(queue[i]+"---");
    }

}
