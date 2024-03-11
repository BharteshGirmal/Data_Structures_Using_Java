
public class Sort 
{
	public static void PrintArray(int []crr)
	{
		System.out.println("Printing Array Elements");
		for(int i=0;i<crr.length;i++)
		{
			System.out.print(crr[i]+ "   ,");
		}
		System.out.println();
	}
	
	/*public static void MergeSort(int crr , int left , int right)
	{
		if(left < right)
		{
			MergeSort(crr, left, (left+right)/2);
			MergeSort(crr, (left+right)/2 +1 , right);
		}
	}*/

	public static int[] MergeSortPartition(int[] arr , int[] brr) // Function is returning the int array
	{
		int[] crr = new int [arr.length + brr.length];
		// Creating 3rd array of size arr+brr
		int i=0;
		int j=0;
		int k=0; // array Index
		while( i <arr.length && j<brr.length) // Exit Condition
		{
			if(arr[i] <= brr[j])
			{
				crr[k]=arr[i]; // copying Elements of array arr to crr
				i++;
			}
			else
			{
				// copying Elements of array brr to crr
				crr[k]=brr[j];
				j++;
			}
			k++;
		}
		
		// to Copy reaming elements of array
		if( i == arr.length)
		{
			while(j<brr.length)
			{
				crr[k]=brr[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<arr.length)
			{
				crr[k]=arr[i];
				i++;
				k++;
			}
		}
		
		return crr; // returning the Filled array crr

	}

}
