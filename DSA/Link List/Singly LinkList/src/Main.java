
public class Main 
{

	public static void main(String[] args) 
	{
		LinkList List = new LinkList();
		List.Append(10);
		List.Insert1(40);
		List.Append(23);
		List.Insert1(50);
		List.Append(300);
		List.Insert1(3);
		List.Append(11);
		System.out.print(List);
		//List.DeleteFirst();
		System.out.println(List);
		List.ReversePrint();
		System.out.println(List);
		List.ReverseLinkList();
		System.out.println(List);
		List.OddLinklist();
		List.EvenLinklist();
		List.BiggestElement();
		List.SmallestElement();
	}

}
