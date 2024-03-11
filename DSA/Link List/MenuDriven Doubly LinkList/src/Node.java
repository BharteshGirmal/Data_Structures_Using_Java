
public class Node 
{
	Node next;
	Node prev;
	int data;
	
	public Node()
	{
		next=null;
		prev=null;
		data=0;
	}
	
	public Node(int data)
	{
		this.next=null;
		this.prev=null;
		this.data=data;
	}
	
	public Node(int dat, Node next , Node prev)
	{
		this.next=next;
		this.prev=prev;
		this.data=data;
	}
	
	public String toString()
	{
		String str=data+"  ,";
		return str;
	}
	

}
