package sorting;

//public class SelectionSort {
//	static void Selection_Sort(int a[])
//
//	{
//
//	int i,j,min,pos;
//
//	for(i=0;i<a.length-1;i++) // n=5 length=5 length-1--> 4 0,1,2,3 passes
//
//	{
//
//	min=a[i];
//
//	pos=i;
//
//	for(j=i+1;i<a.length;j++)
//
//	{
//
//	if (a[j]<min)
//
//	{
//
//	min=a[j];
//
//	pos=j;
//
//	}
//
//	}//min found
//
//	a[pos]=a[i];
//
//	a[i]=min;
//
//	}
//
//	}
//	
//	  static void print_array(int a[])
//	    {
//	        System.out.println("\nArray has");
//	        for(int i=0;i<a.length;i++)
//	            System.out.print(a[i]+", ");
//	    }
//	    public static void main(String args[])
//	    {
//	        int a[]={88,11,33,22,66,111,55,77,44,99};
//	        print_array(a);
//	        Selection_Sort(a);
//	        print_array(a);
//
//	    }
//}


//package sorting;

public class SelectionSort {
    static void Selection_Sort(int a[]) {
        int i, j, min, pos;

        for (i = 0; i < a.length - 1; i++) { // n=5 length=5 length-1--> 4 0,1,2,3 passes
            min = a[i];
            pos = i;

            for (j = i + 1; j < a.length; j++) { // Corrected condition
                if (a[j] < min) {
                    min = a[j];
                    pos = j;
                }
            } // min found
            a[pos] = a[i];
            a[i] = min;
        }
    }

    static void print_array(int a[]) {
        System.out.println("\nArray has");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + ", ");
    }

    public static void main(String args[]) {
        int a[] = {88, 11, 33, 22, 66, 111, 55, 77, 44, 99};
        print_array(a);
        Selection_Sort(a);
        print_array(a);
    }
}

