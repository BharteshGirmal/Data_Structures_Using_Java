import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 2nd stack");
		int size = sc.nextInt();
		Stack s2 = new Stack(size);
		System.out.println("Push the Elements to stack to Cocatinate");
		Stack s1 = new Stack();
		do
		{
			System.out.println("Select the following"
					+ "\n1.Push"
					+ "\n2.Pop"
					+ "\n3.Print"
					+ "\n0.Exit"
					+ "\nEnter your choice");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the number to push");
				int x =sc.nextInt();
				s1.push(x);
				break;
			case 2:
				s1.pop();
				break;
			case 3:

				System.out.println(s1);

				break;

			default :
				System.out.println("Wrong choice");
				break;
			}

		}while(true);
	}

}
