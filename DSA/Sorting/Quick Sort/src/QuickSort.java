
public class QuickSort 
{	
	
	public static void Quicksort(int []arr , int l , int h)
	{
		if(l < h ) // Terminating Condition of recursive Quicksort Function
		{
			int pi=Partition(arr, l, h); // Dividing Array
			Quicksort(arr, l, pi-1); // Left hand side Partition
			Quicksort(arr, pi+1, h); // Right hand side Partition
		}	
	}
	
	
	private static int Partition(int[]arr , int l,int h)
	{
		int pivot=h;
		int i=l-1;	
		int j=l;

		while(j != pivot)
		{
			if(arr[j] < arr[pivot])
			{
				i++;
				// Swap;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			j++;
		}
		i++;
		// Conditional swapping
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		return i;
	}

	
	public static void print(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) {  //n
			System.out.print(arr[i] + ", ");
		}
		System.out.println();		
	}
}
