
public class BubbleSort 
{
	public static void BubblesortDeseceding(int []arr)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i+1]>arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	public static void BubblesortAscending(int []arr)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i+1]<arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	
	public static void PrintArray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ,");
		}
		System.out.println();
		
	}

}
