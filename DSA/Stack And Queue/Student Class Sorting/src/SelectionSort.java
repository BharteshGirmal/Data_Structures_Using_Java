
public class SelectionSort 
{
	public static void NameAscending(Student [] arr)
	{
		for(int p=0; p<arr.length-1;p++)
		{
			int i = p;
			Student x = arr[i];
			while(i < arr.length)
			{
				if(arr[i].getName() .compareToIgnoreCase(x.getName())< 0)
				{
					Student temp =arr[i];
					arr[i]=x;
					x=temp;
				}
				i++;
			}
			arr[p]=x;
		}
	}
	
	public static void Namedecending(Student [] arr)
	{
		for(int p=0; p<arr.length-1;p++)
		{
			int i = p;
			Student x = arr[i];
			while(i < arr.length)
			{
				if(arr[i].getName() .compareToIgnoreCase(x.getName())> 0))
				{
					Student temp =arr[i];
					arr[i]=x;
					x=temp;
				}
				i++;
			}
			arr[p]=x;
		}
	}
	
	public static void AgeAscending(Student [] arr)
	{
		for(int p=0; p<arr.length-1;p++)
		{
			int i = p;
			Student x = arr[i];
			while(i < arr.length)
			{
				if(arr[i].getAge() < x.getAge())
				{
					Student temp =arr[i];
					arr[i]=x;
					x=temp;
				}
				i++;
			}
			arr[p]=x;
		}
	}
	
	public static void Agedecending(Student [] arr)
	{
		for(int p=0; p<arr.length-1;p++)
		{
			int i = p;
			Student x = arr[i];
			while(i < arr.length)
			{
				if(arr[i].getAge() > x.getAge())
				{
					Student temp =arr[i];
					arr[i]=x;
					x=temp;
				}
				i++;
			}
			arr[p]=x;
		}
	}
	
	public static void MarksAscending(Student [] arr)
	{
		for(int p=0; p<arr.length-1;p++)
		{
			int i = p;
			Student x = arr[i];
			while(i < arr.length)
			{
				if(arr[i].getMarks()< x.getMarks())
				{
					Student temp =arr[i];
					arr[i]=x;
					x=temp;
				}
				i++;
			}
			arr[p]=x;
		}
	}
	
	public static void Marksdecending(Student [] arr)
	{
		for(int p=0; p<arr.length-1;p++)
		{
			int i = p;
			Student x = arr[i];
			while(i < arr.length)
			{
				if(arr[i].getMarks() > x.getMarks())
				{
					Student temp =arr[i];
					arr[i]=x;
					x=temp;
				}
				i++;
			}
			arr[p]=x;
		}
	}

	public static void print(Student[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Student Name : "+arr[i].getName()+"  Age : "+arr[i].getAge()+"  Gender : "
									+arr[i].getGender()+"  Marks : "+arr[i].getMarks()+" \n");
		}
		System.out.println();
	}

}

