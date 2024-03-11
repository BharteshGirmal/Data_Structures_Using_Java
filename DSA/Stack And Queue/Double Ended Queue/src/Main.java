import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size DeQueue");
		int size = sc.nextInt();
		DQueue D = new DQueue(size);
		
		D.insertR(20);
		D.insertR(30);
		D.insertR(40);
		D.insertF(50);
		D.insertF(60);
		D.insertF(70);
		D.deleteF();
		D.insertF(80);
		D.deleteR();
		System.out.println(D);

	}

}
