
public class Node 
{
	Node next;
	Node prev;
	int data;
	
	public Node() 
	{
		this.next=null;
		this.prev=null;
		this.data=0;
	}
	public Node(int data) 
	{
		this.next=null;
		this.prev=null;
		this.data=data;
	}
	public Node(Node next , Node prev , int data) 
	{
		this.next=next;
		this.prev=prev;
		this.data=data;
	}
	
	public String toString()
	{
		String str= data+ "    ";
		return str;
	}


}
