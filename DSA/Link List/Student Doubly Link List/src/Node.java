
public class Node 
{
	Node next;
	Node prev;
	Student data;
	
	public Node()
	{
		next=null;
		prev=null;
		data=null;
	}
	
	public Node(Student data)
	{
		this.next=null;
		this.prev=null;
		this.data=data;
	}
	
	public Node(Student data, Node next , Node prev)
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
