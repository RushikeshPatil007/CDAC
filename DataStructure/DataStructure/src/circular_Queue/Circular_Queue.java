package circular_Queue;

public class Circular_Queue {
	int front,rear=-1,Maxsize,circular_queue[],count=0;
    
    void create_queue(int size)
    {
        front=0;
        rear=-1;
        count++;
        Maxsize=size;
        circular_queue=new int[Maxsize];
    }
    void circular_enqueue(int e)
    {
        rear=(rear+1)%Maxsize;
        count++;
        circular_queue[rear]=e;
    }
    boolean is_full()
    {
        if(count==Maxsize)
            return true;
        else
            return false;
    }
    int circular_dequeue()
    {
    	int temp=circular_queue[front];
        front=(front+1)%Maxsize;
        count--;
        return(front);
    }

    boolean is_empty()
    {
        if(count==0)
            return true;
        else
            return false;
    }
    void print_queue()
    {
        for(int i=front ;i<=rear;i++)
            System.out.println(circular_queue[i]+"---");
    }
}
