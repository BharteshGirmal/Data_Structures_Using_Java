
public class Sort 
{
	public static void HeapSort(int arr[])
	{
		// First  Max Heapify
		for(int i=(arr.length/2)-1;i>=0;i--)
		{
			Heapify(arr,arr.length,i);
		}
		
		// 2nd Heapify for Removing 1 elment and swap
		for(int i=arr.length-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			//again Heapify
			Heapify(arr,i,0);
		}
	}

	private static void Heapify(int[] arr, int length, int i) 
	{
		int Maximum=i;  // this is a Maximum index
		int Left=2*i+1; // Left child node
		int Right=2*i+2;// Right child node
		
		
		if(Left<length && arr[Left] > arr[i])
		{
			Maximum=Left;
		}
		if(Right<length && arr[Right] > arr[Maximum])
		{
			Maximum=Right;
		}
		if(Maximum != i)
		{
			int temp=arr[i];
			arr[i]=arr[Maximum];
			arr[Maximum]=temp;
			//again Heapify
			Heapify(arr, length, Maximum);
		}
	}
	
	public static void Print(int []arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+"  ,");
		}
		System.out.println();
	}

}
