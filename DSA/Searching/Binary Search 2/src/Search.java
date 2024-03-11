import java.util.Scanner;

public class Search 
{
	int []arr;
	
	public void  ArraySize(int size)
	{
		arr=new int[size];
	}
	
	public void AcceptArray()
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0 ;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" Number");
			arr[i]=sc.nextInt();
		}
	}
	
	public void PrintArray()
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0 ;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ,");
		}
		System.out.println();
	}
	
	public int Binary_Search(int key)
	{
		int low=0;
		int high=arr.length;
		int mid=(low+high)/2;
		
		while(arr[mid] != key)
		{
			if(key < arr[mid])
				high=mid -1;
			else
				low=mid+1;
			mid=(low+high)/2;
		}
		if(arr[mid]==key)
			return mid;
		else
			return -1;
	}

}
