import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Circular Queue");
		int size = sc.nextInt();
		CQueue C=new CQueue(size);
		do
		{
			System.out.println("\n1.Insert"
					+ "\n2.Delete"
					+ "\n3.Print Circular Queue"
					+ "\n0.Exit"
					+ "\nEnter your choice");
			 choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter elements to Insert");
				int num=sc.nextInt();
				C.insert(num);
				break;
			case 2:
				C.delete();
				break;
			case 3:
				System.out.println(C);
				break;
			default :
				System.out.println("Wrong Choice");
					break;
			}
		}while(choice !=0);
	}

}
