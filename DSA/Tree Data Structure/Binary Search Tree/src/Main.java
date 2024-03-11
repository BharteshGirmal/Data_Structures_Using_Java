
public class Main 
{

	public static void main(String[] args) 
	{
		BST Binary=new BST();
		Binary.Insert(51);
		Binary.Insert(5);
		Binary.Insert(12);
		Binary.Insert(54);
		Binary.Insert(74);
		Binary.Insert(3);
		Binary.Insert(2);
		Binary.Insert(8);
		Binary.Insert(14);
		Binary.Insert(21);
		Binary.Insert(15);
		Binary.Insert(48);
		
		Binary.PreOrder();
		Binary.InOrder();
		Binary.PostOrder();
		
		Binary.PrintLargest();
		Binary.PrintSmallest();
		
		Binary.Delete(2);
		Binary.InOrder();
		
		int height =Binary.CalculateHeight();
		System.out.println("Height of Binary Search Tree : "+height);
		
		
	
	}

}
