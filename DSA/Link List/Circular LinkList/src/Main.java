
public class Main 
{

	public static void main(String[] args) 
	{
		CicularLinkList CLL = new CicularLinkList();
		
		CLL.InsertFirst(10);
		CLL.InsertFirst(22);
		CLL.Append(11);
		CLL.Append(24);
		System.out.println(CLL);
		CLL.InsertByPos(121, 2);
		System.out.println(CLL);
	}

}
