package sorting;

public class InsertionSort {
	static void Insertion_Sort(int a[])

	{

	int i,j,new_element;

	for(i=0;i<a.length-1;i++)

	{

	j=i+1;

	new_element=a[j];

	while(j>0 && a[j-1]>new_element)

	{

	a[j]=a[j-1];//come back

	j--;

	}

	a[j]=new_element;

	}
	}
	static void print_array(int a[]) {
        System.out.println("\nArray has");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + ", ");
    }

    public static void main(String args[]) {
        int a[] = {111,22,65,874};
        print_array(a);
        Insertion_Sort(a);
        print_array(a);
    }
}
