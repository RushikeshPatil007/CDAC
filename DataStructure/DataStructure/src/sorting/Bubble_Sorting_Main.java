package sorting;

public class Bubble_Sorting_Main
{
    static void Bubble_Sort(int a[])
    {
        int i,j,temp;
        for(i=0;i<a.length-1;i++)  //  n=5   length=5   length-1--> 4  0,1,2,3 passes
        {
            for(j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
      static void print_array(int a[])
    {
        System.out.println("\nArray has");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+", ");
    }
    public static void main(String args[])
    {
        int a[]={88,11,33,22,66,111,55,77,44,99};
        print_array(a);
        Bubble_Sort(a);
        print_array(a);

    }

}