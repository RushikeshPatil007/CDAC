package heap;

public class HeapSort {
	static void Heap_Sort(int a[])

	{

		int i, j, pointer;// pointer:child pointer/2:parent

		for (i = a.length - 1; i > 0; i--)

		{

			for (j = 0; j <= i; j++)

			{

				pointer = j;

				while (pointer > 0 && pointer / 2 >= 0)

				{

					if (a[pointer / 2] < a[pointer])

//parent < child

					{

						int temp = a[pointer];

						a[pointer] = a[pointer / 2];

						a[pointer / 2] = temp;

					} // if

					pointer = pointer / 2;

				} // while

			} // for j

			int temp = a[0];
			a[0] = a[i];

			a[i] = temp;  

		} // for i
		

	}
	static void print_array(int a[]) {
        System.out.println("\nArray has");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + ", ");
    }
	
	public static void main(String args[]) {
        int a[] = {20,5,15,10,9};
        print_array(a);
        Heap_Sort(a);
        print_array(a);
    }
}
// code
