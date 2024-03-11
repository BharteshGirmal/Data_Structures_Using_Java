import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student X; // Creating an Object of Student class
		System.out.println("Enter the size of Student stack");
		int size = sc.nextInt();
		Stack s1 = new Stack(size);
		do
		{
			System.out.println("\n1.Push"
					+ "\n2.Pop"
					+ "\n3.Print"
					+ "\n0.Exit"
					+ "\nEnter your choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Name of Student");
				String name = sc.next();
				System.out.println("Enter the Age of student");
				int age = sc.nextInt();
				System.out.println("Enter Gender");
				char gender = sc.next().charAt(0);
				X = new Student(name,age,gender);
				s1.push(X);
				break;
			case 2:
				s1.pop();
				break;
			case 3:
				System.out.println(s1);
				break;
				default :
					System.out.println("Wrong Choice");
					break;
			}
			
		}while(true);
	
	

	}

}
