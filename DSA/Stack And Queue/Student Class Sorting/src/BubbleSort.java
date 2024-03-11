
public class BubbleSort 
{
	public static void AgeDeseceding(Student []arr)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i+1].getAge()>arr[i].getAge())
				{
					Student temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	public static void AgeAscending(Student []arr)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i+1].getAge()<arr[i].getAge())
				{
					Student temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	
	public static void MarksDeseceding(Student []arr)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i+1].getMarks()>arr[i].getMarks())
				{
					Student temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	public static void MarksAscending(Student []arr)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i+1].getMarks()<arr[i].getMarks())
				{
					Student temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	
	public static void PrintArray(Student []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Student Name : "+arr[i].getName()+"  Age : "+arr[i].getAge()+"  Gender : "
					+arr[i].getGender()+"  Marks : "+arr[i].getMarks()+" \n");
		}
		System.out.println();
		
	}

}
