import java.util.Scanner;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String []args) 
	{
		
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("Enter the Array Elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before Sort");
		InsertionSort.PrintArray(arr);
		InsertionSort.InserstionAssending(arr);
		System.out.println();
		System.out.println("After Sort");
		InsertionSort.PrintArray(arr);
		InsertionSort.InserstionDecending(arr);
		System.out.println();
		System.out.println("After Sort");
		InsertionSort.PrintArray(arr);

		sc.close();
	}
	
}
