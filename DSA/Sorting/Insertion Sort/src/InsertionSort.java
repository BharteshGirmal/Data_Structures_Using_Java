import java.util.Scanner;

public class InsertionSort 
{
	public static void PrintArray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ,");
		}
	}

	public static void InserstionAssending(int []arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			int i=j;
			while(i>0)
			{
				if(arr[i] < arr[i-1])
				{
					int temp = arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;

					i--;
				}
				else
					break;
			}
		}	
	}
	
	public static void InserstionDecending(int []arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			int i=j;
			while(i>0)
			{
				if(arr[i] > arr[i-1])
				{
					int temp = arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;

					i--;
				}
				else
					break;
			}
		}	
	}
   
}
