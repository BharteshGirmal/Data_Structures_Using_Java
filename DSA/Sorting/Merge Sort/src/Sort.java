
public class Sort 
{
	public static void MergeSort(int []crr,int Left , int Right)
	{
		if(Left < Right)
		{
			int M=(Left+Right)/2  ;
			MergeSort(crr, Left, M); // Recursive Call;
			MergeSort(crr, M+1, Right); // Dividing the Array in two diff array
			Merge(crr, Left, M, Right); // Merging the two arrays in one array
		}

	}

	public static void Merge(int []crr,int Left ,int Mid,int Right)
	{
		// Making Two Seperate Arrays

		int N1=(Mid-Left)+1; // Calculating the size of array1
		int N2= Right-(Mid+1) +1; // Calculating the size of array2

		int []arr=new int[N1];
		int []brr=new int[N2];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=crr[Left+i];
		}
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=crr[Mid+1+i];
		}

		int i=0;
		int j=0;
		int k=Left;

		while(i<arr.length && j<brr.length)
		{
			if(arr[i] <= brr[j])
			{
				crr[k]=arr[i];
				k++;
				i++;
			}
			else
			{
				crr[k]=brr[j];
				k++;
				j++;
			}
		}


		if(i == arr.length)
		{
			while(j < brr.length)
			{
				crr[k]=brr[j];
				k++;
				j++;
			}
		}
		else
		{
			while(i< arr.length)
			{
				crr[k]=arr[i];
				k++;
				i++;
			}
		}
	}

	public static void Print(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ,");
		}
		System.out.println();
	}

}
