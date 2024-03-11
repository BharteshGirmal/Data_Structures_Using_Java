import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		CicularLinkList CLL =new CicularLinkList();
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
				System.out.println("Enter the element to add");
				int ele=sc.nextInt();
				CLL.InsertFirst(ele);
				break;
			case 2:
				System.out.println("Enter the element to add");
				int s=sc.nextInt();
				CLL.Append(s);
				break;
			case 3:
				System.out.println("Enter the Element to Add");
				int x=sc.nextInt();
				System.out.println("Enter the posotion of Element to add");
				int y=sc.nextInt();
				CLL.InsertByPos(x, y);
				break;
			case 4:
				CLL.DeleteFirst();
				break;
			case 5:
				CLL.DeleteLast();
				break;
			case 6:
				System.out.println("Enter the position of element to delete");
				int pos=sc.nextInt();
				CLL.DeleteByPos(pos);
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
