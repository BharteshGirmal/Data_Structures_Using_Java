import java.util.Scanner;

public class Main 
{
	static String Name;
	static int Age;
	static float Salary;

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		CicularLinkList CLL =new CicularLinkList();
		Employee Emp; // Object of Employee
		int choice;
		do
		{
			System.out.println("Select the Following option"
					+ "\n1.Insert AT First Position"
					+ "\n2.Insert at Last"
					+ "\n3.Insert in Between the position"
					+ "\n4.Delete First"
					+ "\n5.Delete Last"
					+ "\n6.Delete By Position"
					+ "\n7.Print Odd Data"
					+ "\n8.Print Evevn Data"
					+ "\n9.Print"
					+ "\n10.Exit"
					+ "\nEnter Your Choice");

			choice=sc.nextInt();
			switch(choice)
			{
			case 1:

				System.out.println("Enter the Employee Name");
				Name=sc.next();
				System.out.println("Enter the Employee Age");
				Age=sc.nextInt();
				System.out.println("Enter the Employee Salary");
				Salary=sc.nextFloat();
				Emp=new Employee(Name , Age , Salary);
				CLL.InsertFirst(Emp);
				break;
			case 2:
				System.out.println("Enter the Employee Name");
				Name=sc.next();
				System.out.println("Enter the Employee Age");
				Age=sc.nextInt();
				System.out.println("Enter the Employee Salary");
				Salary=sc.nextFloat();
				Emp=new Employee(Name , Age , Salary);
				CLL.Append(Emp);
				break;
			case 3:
				System.out.println("Enter the Employee Name");
				Name=sc.next();
				System.out.println("Enter the Employee Age");
				Age=sc.nextInt();
				System.out.println("Enter the Employee Salary");
				Salary=sc.nextFloat();
				Emp=new Employee(Name , Age , Salary);
				System.out.println("Enter the posotion of Element to add");
				int pos=sc.nextInt();
				CLL.InsertByPos(Emp, pos);
				break;
			case 4:
				CLL.DeleteFirst();
				break;
			case 5:
				CLL.DeleteLast();
				break;
			case 6:
				System.out.println("Enter the position of element to delete");
				int posi=sc.nextInt();
				CLL.DeleteByPos(posi);
				break;
			case 7:
				CLL.OddData();
				break;
			case 8:
				CLL.EvenData();
				break;
			case 9:
				System.out.println(CLL);
				break;
			case 10:
				break;
			default :
				System.out.println("Invalid Choice");
				break;
			}

		}while(choice != 10);

	}

}
