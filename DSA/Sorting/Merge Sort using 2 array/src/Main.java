
public class Main
{

	public static void main(String[] args) 
	{
		// Only runs for sorted arrays either in ascending or descending
		int []arr=new int[] {5,10,20,30,40,50,60};
		int []brr=new int[] {2,4,6,8,10,14,18,90};
		int []crr= Sort.MergeSortPartition(arr, brr);
		Sort.PrintArray(crr);
	}

}
