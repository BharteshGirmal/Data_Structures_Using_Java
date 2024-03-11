
public class Node 
{
	Node Left;
	Node Right;
	int data;
	
	public Node(int data)
	{
		this.data=data;
		this.Left=null;
		this.Right=null;
	}
	
	public Node(int data,Node Left,Node Right)
	{
		this.data=data;
		this.Left=Left;
		this.Right=Right;
	}
}
