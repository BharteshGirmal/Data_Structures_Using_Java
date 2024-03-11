
public class Node 
{
	Node next;
	Node prev;
	Employee data;
	
	public Node() 
	{
		this.next=null;
		this.prev=null;
		this.data=null;
	}
	public Node(Employee data) 
	{
		this.next=null;
		this.prev=null;
		this.data=data;
	}
	public Node(Node next , Node prev , Employee data) 
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
