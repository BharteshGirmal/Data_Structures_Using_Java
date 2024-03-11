
public class Node 
{
	Node next ;
	Employee data;
	
	public Node()
	{
		this.next=null;
		this.data=null;
	}
	
	public Node(Employee data)
	{
		this.next=null;
		this.data=data;
	}
	
	public Node(Node next)
	{
		this.next=next;
		this.data=null;
	}
	
	public Node(Employee data , Node next)
	{
		this.next=next;
		this.data=data;
	}

}
