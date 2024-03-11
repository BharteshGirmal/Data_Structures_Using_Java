
public class Main 
{

	public static void main(String[] args) 
	{
		int [] arr = new int[] {50,20,14,12,20,85,62,30,28};

		//SelectionSort S = new SelectionSort();
		System.out.println("Before Sort");
		SelectionSort.print(arr);
		SelectionSort.Asecending(arr);
		System.out.println("After Sorting");
		SelectionSort.print(arr);
		SelectionSort.Dsecending(arr);
		System.out.println("After Sorting");
		SelectionSort.print(arr);
	}

}
