import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Stack s1 = new Stack();
		System.out.println("Enter the size of 2nd stack");
		int size = sc.nextInt();
		Stack s2 = new Stack(10);
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.pop();
		System.out.println(s1);
		
		s2.push(100);
		s2.push(200);
		s2.push(300);
		s2.push(400);
		s2.push(500);
		s2.pop();
		System.out.println(s2);
		
		

	}

}
