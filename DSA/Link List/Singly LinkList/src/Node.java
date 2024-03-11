
public class Node 
{
	Node next ;
	int data;
	
	public Node()
	{
		this.next=null;
		this.data=0;
	}
	
	public Node(int data)
	{
		this.next=null;
		this.data=data;
	}
	
	public Node(Node next)
	{
		this.next=next;
		this.data=0;
	}
	
	public Node(int data , Node next)
	{
		this.next=next;
		this.data=data;
	}
	
	public String toString() 
	{
		String str = data+"  ,";
		return str;
	}

}
