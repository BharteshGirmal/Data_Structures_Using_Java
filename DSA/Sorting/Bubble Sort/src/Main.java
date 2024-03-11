import java.util.Scanner;

public class Main 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Sorting");
		BubbleSort.PrintArray(arr);
		BubbleSort.BubblesortDeseceding(arr);
		System.out.println("After Sorting");
		BubbleSort.PrintArray(arr);
		BubbleSort.BubblesortAscending(arr);
		BubbleSort.PrintArray(arr);
	}

}
