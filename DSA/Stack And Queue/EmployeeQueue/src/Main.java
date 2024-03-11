import java.util.Scanner;

public class Main 
{
	public static void main(String []args)
	{
		Employee E1=null; // Creating object of Employee class

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Employee Queue");
		int s = sc.nextInt();
		Queue Q1 = new Queue(s);
		do
		{
			System.out.println("\n1.Insert"
					+ "\n2.Remove"
					+ "\n3.Print"
					+ "\n0.Exit"
					+ "\nEnter your choice");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Employee ID");
				int id=sc.nextInt();
				System.out.println("Enter the Employee Name");
				String name =sc.next();
				System.out.println("Enter the Salray");
				float salary=sc.nextFloat();
				E1 = new Employee(id,name,salary);
				Q1.insert(E1);
				break;
			case 2:
				Q1.remove();
				break; 
			case 3:
				System.out.println(Q1);
				break;
			default :
				System.out.println("Wrong choice");
				break;
			}

		}while(true);
	}

}
