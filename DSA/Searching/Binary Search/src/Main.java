import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		Search ss=new Search();
		ss.ArraySize(size);
		ss.AcceptArray();
		ss.PrintArray();
		System.out.println("Enter the key to search");
		int key=sc.nextInt();
		int x=ss.Binary_Search(key);
		if(x > 0)
		{
			System.out.println("The key "+key+" is found at index : "+x);
		}
		else
			System.out.println("Key Not Found");
		
		

	}

}
