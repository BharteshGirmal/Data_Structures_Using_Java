import java.util.Scanner;

public class Main 
{
	static String name;
	static int age;
	static char gender;

	public static void main(String[] args) 
	{
		DoublyLinkList DLL = new DoublyLinkList();
		Student stud;
		
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("\nSelect the following Option"
					+ "\n1.InsertFirst"
					+ "\n2.Append at last"
					+ "\n3.Insert by Position"
					+ "\n4.Delete First"
					+ "\n5.Delete Last"
					+ "\n6.Delete by Position"
					+ "\n7.Print Forward"
					+ "\n8.Print Reverse"
					+ "\n9.Print Odd Data"
					+ "\n10.Print Even Data"
					+ "\n11.Print LinkList"
					+ "\n12.Exit"
					+ "\nEnter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Student Name");
				name=sc.next();
				System.out.println("Enter the Student Age");
				age=sc.nextInt();
				System.out.println("Enter the Student Gender");
				gender=sc.next().charAt(0);				
				stud=new Student(name,age,gender);
				DLL.InsertFirst(stud);
				break;
			case 2:
				System.out.println("Enter the Student Name");
				name=sc.next();
				System.out.println("Enter the Student Age");
				age=sc.nextInt();
				System.out.println("Enter the Student Gender");
				gender=sc.next().charAt(0);				
				stud=new Student(name,age,gender);
				DLL.Append(stud);
				break;
			case 3:
				System.out.println("Enter the Student Name");
				name=sc.next();
				System.out.println("Enter the Student Age");
				age=sc.nextInt();
				System.out.println("Enter the Student Gender");
				gender=sc.next().charAt(0);				
				stud=new Student(name,age,gender);
				System.out.println("Enter the Postion");
				int pos=sc.nextInt();
				DLL.InsertByPos(stud, pos);
				break;
			case 4:
				DLL.DeleteFirst();
				break;
			case 5:
				DLL.DeleteLast();
				break;
			case 6:
				System.out.println("Enter the Positon of node to delete");
				int po =sc.nextInt();
				DLL.DeleteByPos(po);
				break;
			case 7:
				DLL.PrintForward();
				break;
			case 8:
				DLL.PrintReverse();
				break;
			case 9:
				DLL.OddData();
				break;
			case 10:
				DLL.EvenData();
				break;
			case 11:
				System.out.println(DLL);
				break;
			case 12:
				break;
			default :
				System.out.println("Invalid Choice");
				break;
				
			}
		}while(choice != 12);

	}

}
