import java.util.Scanner;

public class InsertionSort 
{
	public static void PrintArray(Student []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Student Name : "+arr[i].getName()+"  Age : "+arr[i].getAge()+"  Gender : "
					+arr[i].getGender()+"  Marks : "+arr[i].getMarks()+" \n");
		}
		System.out.println();
	}

	public static void AgeAsecending(Student []arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			int i=j;
			while(i>0)
			{
				if(arr[i].getAge() < arr[i-1].getAge())
				{
					Student temp = arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;

					i--;
				}
				else
					break;
			}
		}	
	}

	public static void AgeDecending(Student []arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			int i=j;
			while(i>0)
			{
				if(arr[i].getAge() > arr[i-1].getAge())
				{
					Student temp = arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;

					i--;
				}
				else
					break;
			}
		}	
	}
	
	public static void MarksAsecending(Student []arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			int i=j;
			while(i>0)
			{
				if(arr[i].getMarks()< arr[i-1].getMarks())
				{
					Student temp = arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;

					i--;
				}
				else
					break;
			}
		}	
	}

	public static void MarksDecending(Student []arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			int i=j;
			while(i>0)
			{
				if(arr[i].getMarks()> arr[i-1].getMarks())
				{
					Student temp = arr[i];
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
