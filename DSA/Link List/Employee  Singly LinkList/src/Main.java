import java.awt.List;
import java.util.Scanner;

public class Main 
{
	static Employee emp ;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LinkList Emp = new LinkList();

		System.out.println(Emp);

		int choice ;
		do
		{
			System.out.println("\nEnter the following"
					+ "\n1.Insert First"
					+ "\n2.Append at last"
					+ "\n3.Delete First"
					+ "\n4.Delete Last"
					+ "\n5.Print"
					+ "\n6.Exit"
					+ "\nEnter Your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Employee Id");
				int id=sc.nextInt();
				System.out.println("Enter the Employee Name");
				String name = sc.next();
				System.out.println("Enter the Salary");
				float salary =sc.nextFloat();
				emp = new Employee(id,name,salary);
				Emp.Insert1(emp);
				break;
			case 2:
				System.out.println("Enter the Employee Id");
				int id1=sc.nextInt();
				System.out.println("Enter the Employee Name");
				String name1 = sc.next();
				System.out.println("Enter the Salary");
				float salary1 =sc.nextFloat();
				emp = new Employee(id1,name1,salary1);
				Emp.Append(emp);;
				break;
			case 3:
				Emp.DeleteFirst();
				break;
			case 4:
				Emp.DeleteLast();
				break;
			case 5:
				System.out.println(Emp);
				break;
			case 6:
				break;
			default :
				System.out.println("Wrong Choice");
				break;
			}

		}while(choice != 6);
	}
}
