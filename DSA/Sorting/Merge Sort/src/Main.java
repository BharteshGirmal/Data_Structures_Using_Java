
public class Main 
{

	public static void main(String[] args) 
	{
		int []crr = new int[] {10,14,101,4,55,678,35,32,8,441,336};
		
		Sort.Print(crr);
		Sort.MergeSort(crr, 0, crr.length-1);
		Sort.Print(crr);

	}

}