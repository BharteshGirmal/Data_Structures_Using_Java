import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the elements of Array");
		for(int i=0 ;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		QuickSort.Quicksort(arr, 0, arr.length-1);
		System.out.println("The Sorted Array Using QuickSort Algoritham");
		QuickSort.print(arr);

	}

}
