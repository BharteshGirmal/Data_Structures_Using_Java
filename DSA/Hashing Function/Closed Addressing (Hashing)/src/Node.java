
public class Node 
{
	String data;
	Node next;
	
	public Node()
	{
		this.data=null;
		this.next=null;
	}
	
	public Node(String data)
	{
		this.data=data;
		this.next=null;
	}
	
	public Node(String data , Node next)
	{
		this.data=data;
		this.next=next;
	}
	
	public String toString()
	{
		String str=this.data+"   ,";
		return str;
	}

}
