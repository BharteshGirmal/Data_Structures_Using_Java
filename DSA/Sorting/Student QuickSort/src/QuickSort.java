
public class QuickSort 
{	
	
	public static void Quicksort(Student []arr , int l , int h)
	{
		if(l < h ) // Terminating Condition of recursive Quicksort Function
		{
			int pi=Partition(arr, l, h); // Dividing Array
			Quicksort(arr, l, pi-1); // Left hand side Partition
			Quicksort(arr, pi+1, h); // Right hand side Partition
		}	
	}
	
	
	private static int Partition(Student[]arr , int l,int h)
	{
		int pivot=h;
		int i=l-1;	
		int j=l;

		while(j != pivot)
		{
			if(arr[j].Age < arr[pivot].Age)
			{
				i++;
				// Swap;
				Student temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
			j++;
		}
		i++;
		// Conditional swapping
		Student temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		return i;
	}

	
	public static void print(Student [] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{  
			System.out.print(arr[i]+"\n");
		}
		System.out.println();		
	}
}
