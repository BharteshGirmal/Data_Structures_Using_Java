
public class Main 
{

	public static void main(String[] args) 
	{
		DLinkList dll = new DLinkList();
		dll.InsertFirst(20);
		dll.InsertFirst(55);
		dll.InsertLast(54);
		dll.InsertLast(631);
		dll.InsertFirst(100);
		dll.InsertFirst(415);
		dll.InsertLast(12);
		System.out.println(dll);
		dll.ReversePrint();
		dll.DeleteFirst();
		System.out.println(dll);
		dll.DeleteLast();
		System.out.println(dll);
		System.out.println("Reverse Print");
		dll.ReversePrint();
		System.out.println("Forward Print");
		dll.PrintForward();

	}

}
