import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		LinkList List = new LinkList();
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
					+ "\n7.Print Odd Elements of LinkList"
					+ "\n8.Print Evevn Elements of LinkList"
					+ "\n9.Find Biggest Element of LinkList"
					+ "\n10.FInd Smallest Element of LinkList"
					+ "\n11.Print the LinkList in Recerse"
					+ "\n12.Reverse the Whole LinkList"
					+ "\n13.Insert By value"
					+ "\n14.Print"
					+ "\n15.Exit"
					+ "\nEnter Your Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the element to add");
				int ele=sc.nextInt();
				List.Insert1(ele);
				break;
			case 2:
				System.out.println("Enter the element to add");
				int s=sc.nextInt();
				List.Append(s);
				break;
			case 3:
				System.out.println("Enter the Element to Add");
				int x=sc.nextInt();
				System.out.println("Enter the posotion of Element to add");
				int y=sc.nextInt();
				List.InsertByPos(x, y);
				break;
			case 4:
				List.DeleteFirst();
				break;
			case 5:
				List.DeleteLast();
				break;
			case 6:
				System.out.println("Enter the position of element to delete");
				int pos=sc.nextInt();
				List.DeleteByPos(pos);
				break;
			case 7:
				List.OddLinklist();
				break;
			case 8:
				List.EvenLinklist();
				break;
			case 9:
				List.BiggestElement();
				break;
			case 10:
				List.SmallestElement();
				break;
			case 11:
				List.ReversePrint();
				break;
			case 12:
				List.ReverseLinkList();
				break;
			case 13:
				System.out.println("Enter the value of element");
				int value=sc.nextInt();
				System.out.println("Enter the data value of element to add");
				int data=sc.nextInt();
				List.InsertByValue(value, data);
				break;	
			case 14:
				System.out.println(List);
				break;
			case 15:
				break;
			default :
				System.out.println("Invalid Choice");
				break;
			}

		}while(choice != 15);

	}

}
