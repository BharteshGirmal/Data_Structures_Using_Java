import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Student Aray");
		int size = sc.nextInt();
		Student []arr = new Student[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Name of "+(i+1)+" Student");
			String Name=sc.next();
			System.out.println("Enter the Age of "+(i+1)+" Student");
			int Age=sc.nextInt();
			System.out.println("Enter the Gender of "+(i+1)+" Student");
			char Gender=sc.next().charAt(0);
			System.out.println("Enter the Marks of "+(i+1)+" Student");
			int Marks=sc.nextInt();
			arr[i]= new Student(Name,Age,Gender,Marks);
		}


		System.out.println("Condition : 1");
		System.out.println("Using Selelction Sort");
		System.out.println("Before Sort");
		SelectionSort.print(arr);
		SelectionSort.AgeAscending(arr);
		System.out.println("AgeAscending _________________________________");
		SelectionSort.print(arr);
		SelectionSort.Agedecending(arr);
		System.out.println("Agedecending _________________________________");
		SelectionSort.print(arr);
		SelectionSort.MarksAscending(arr);
		System.out.println("MarksAscending________________________________");
		SelectionSort.print(arr);
		SelectionSort.Marksdecending(arr);
		System.out.println("Marksdecending ________________________________");
		SelectionSort.print(arr);
		SelectionSort.NameAscending(arr);
		System.out.println("Name Asecending _______________________________");
		SelectionSort.print(arr);
		System.out.println("Name Dsecending _______________________________");
		SelectionSort.Namedecending(arr);
		SelectionSort.print(arr);
		System.out.println("_______________________________________________");


		System.out.println("Condition : 2");
		System.out.println("Using Inersetion Sort");
		System.out.println("Before Sort");
		InsertionSort.PrintArray(arr);
		InsertionSort.AgeAsecending(arr);
		System.out.println("AgeAscending _________________________________");
		SelectionSort.print(arr);
		InsertionSort.PrintArray(arr);
		InsertionSort.AgeDecending(arr);
		System.out.println("Agedecending _________________________________");
		InsertionSort.PrintArray(arr);
		InsertionSort.MarksAsecending(arr);
		System.out.println("MarksAscending________________________________");
		InsertionSort.PrintArray(arr);
		InsertionSort.MarksDecending(arr);
		System.out.println("Marksdecending ________________________________");
		InsertionSort.PrintArray(arr);
		System.out.println("_______________________________________________");


		System.out.println("Condition : 3");
		System.out.println("Using Bubble Sort");
		System.out.println("Before Sort");
		BubbleSort.PrintArray(arr);
		BubbleSort.AgeAscending(arr);
		System.out.println("AgeAscending _________________________________");
		BubbleSort.PrintArray(arr);
		BubbleSort.AgeDeseceding(arr);
		System.out.println("Agedecending _________________________________");
		BubbleSort.PrintArray(arr);
		BubbleSort.MarksAscending(arr);
		System.out.println("MarksAscending________________________________");
		BubbleSort.PrintArray(arr);
		BubbleSort.MarksDeseceding(arr);
		System.out.println("Marksdecending ________________________________");
		BubbleSort.PrintArray(arr);
		System.out.println("_______________________________________________");
	}

}
