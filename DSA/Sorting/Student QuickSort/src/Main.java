import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		
		Student []arr=new Student[size];
		
		Student Stud ;
		
		
		String name;
		int Age;
		char Gender;
		
		System.out.println("Enter the elements of Array");
		for(int i=0 ;i<arr.length;i++)
		{
			System.out.println("Enter the Name of Student");
			name=sc.next();
			System.out.println("Enter the Age of Student");
			Age=sc.nextInt();
			System.out.println("Enter the Gender of Student");
			Gender=sc.next().charAt(0);
			Stud = new Student(name,Age,Gender);
			arr[i]=Stud;
		}
		
		QuickSort.Quicksort(arr, 0, arr.length-1);
		System.out.println("The Sorted Array Using QuickSort Algoritham");
		QuickSort.print(arr);

	}

}
