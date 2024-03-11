import java.util.Scanner;

public class Stack 
{
	static int top=-1; //pointing just before the zeroth index
	static int arr[];

	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int size = sc.nextInt();
		
		arr = new int[size];	
		
		Push(10);
		Push(20);
		Push(30);
		Push(40);
		Push(50);
		Push(60);
		Print();
		Pop(60);
		Pop(50);
		Pop(40);
		Push(200);
		Push(22);
		Print();

	}

	private static void Print()
	{
		if(top==-1)
		{
			System.out.println("The stack is Empty");
		}
		else
		{	
			for(int i=top ; i >=0; i--)
			{
				System.out.print(arr[i]+"  ,");
			}
		}

	}

	private static int Pop(int x)
	{
		if(top!=-1)
		{
			arr[top]=x;
			top--;
			return x;
		}
		else
		{
			System.out.println("The Stack is Empty No Elemnts to Pop");
		}
		return 0;
	}

	private static void Push(int x)
	{
		if(top==arr.length-1)
		{
			System.out.println("Stack is Full Pop Some Elements to Push ");
		}
		else
		{
			top++;
			arr[top]=x;
		}
	}

}
