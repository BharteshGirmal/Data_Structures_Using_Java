import java.util.Scanner;

public class Main 
{
	static int data;

	public static void main(String[] args) 
	{
		DoublyLinkList DLL = new DoublyLinkList();
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
					+ "\n11Exit"
					+ "\nEnter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the data");
				data=sc.nextInt();
				DLL.InsertFirst(data);
				break;
			case 2:
				System.out.println("Enter the data");
				data=sc.nextInt();
				DLL.Append(data);
				break;
			case 3:
				System.out.println("Enter the data");
				data=sc.nextInt();
				System.out.println("Enter the Postion");
				int pos=sc.nextInt();
				DLL.InsertByPos(data, pos);
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
				break;
			default :
				System.out.println("Invalid Choice");
				break;
				
			}
		}while(choice != 11);

	}

}
