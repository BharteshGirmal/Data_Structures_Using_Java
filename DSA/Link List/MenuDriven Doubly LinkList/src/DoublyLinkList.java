
public class DoublyLinkList 
{
	Node head;
	Node tail;
	
	public DoublyLinkList() 
	{
		head=null;
		tail=null;
	}
	
	public void InsertFirst(int data)
	{
		Node newnode = new Node(data);
		if(head == null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			head.prev=newnode;
			newnode.next=head;
			head=newnode;
		}
	}
	
	public void Append(int data)
	{
		Node newnode = new Node(data);
		if(head == null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
		}
	}
	
	private int GetNodeCount()
	{
		int count=0;
		Node it = head;
		while(it != null)
		{
			count++;
			it=it.next;
		}
		return count;
	}
	
	public void InsertByPos(int data , int pos)
	{
		int count=GetNodeCount();
		Node newnode=new Node(data);
		if(pos == 1)
		{
			InsertFirst(data);
		}
		
		else if (pos == count+1)
		{
			Append(data);
		}
		else if(pos > 1 && pos < count+1)
		{
			Node it =head; // itrator
			for(int i=1;i<pos-1;i++)
			{
				it=it.next;
			}
			
			newnode.next=it.next;
			newnode.prev=it;
			newnode.next.prev=newnode;
			it.next=newnode;
		}
		else
		{
			System.out.println("Invalid Position");
		}
	}
	
	public void DeleteFirst()
	{
		if(head == null)
		{
			System.out.println("Doubly LinkList is Empty");
		}
		else
		{	//for 1 node
			if(head.next == null)
			{
				head=null;
				tail=null;
			}
			// for more than 1 node
			else
			{
				Node it =head;
				head=it.next;
				head.prev=null;
				it.next=null;
			}	
		}
	}
	
	public void DeleteLast()
	{
		if(tail == null)
		{
			System.out.println("Doubly LinkList is Empty");
		}
		else
		{	//for 1 node
			if(head == tail)
			{
				head=null;
				tail=null;
			}
			else
			{
				Node it = tail;
				tail.prev.next=null;
				tail=tail.prev;
				it.prev=null;
			}
		}
	}
	
	public void DeleteByPos(int pos)
	{
		int count=GetNodeCount();
		if(pos == 1)
		{
			DeleteFirst();
		}
		else if(pos == count+1)
		{
			DeleteLast();
		}
		else if(pos >1 && pos< count+1)
		{
			Node it=head;
			for(int i=1; i<pos-1;i++)
			{
				it=it.next;
			}
			
			Node temp=it.next;
			it.next=it.next.next;
			temp.prev=null;
			temp.next=null;
			
		}
		else
		{
			System.out.println("Invalid Position");
		}
	}
	
	public void PrintReverse()
	{
		System.out.println("Printing Reverese Direction");
		Node it =tail;
		if(tail == null)
		{
			System.out.println("Empty....................");
		}
		else
		{
			while(it !=null)
			{
				System.out.print(it.data+"   ,");
				it=it.prev;
			}
		}
		System.out.println();
		
	}
	
	
	public void PrintForward()
	{
		System.out.println("Printing Reverese Direction");
		Node it =head;
		if(head == null)
		{
			System.out.println("Empty....................");
		}
		else
		{
			while(it !=null)
			{
				System.out.print(it.data+"   ,");
				it=it.next;
			}
		}
		System.out.println();
		
	}
	
	public void OddData()
	{
		System.out.println("Printing Odd Data");
		Node it =head;
		if(head == null)
		{
			System.out.println("Empty....................");
		}
		else
		{
			while(it !=null)
			{
				if(it.data % 2 != 0)
				{
					System.out.print(it.data+"   ,");
				}
				it=it.next;
			}
		}
		System.out.println();
	}
	
	public void EvenData()
	{
		System.out.println("Printing EvenData");
		
		if(head == null)
		{
			System.out.println("Empty....................");
		}
		else
		{
			Node it =head;
			while(it !=null)
			{
				if(it.data % 2 == 0)
				{
					System.out.print(it.data+"   ,");
				}
				it=it.next;
			}
		}
		System.out.println();
	}
	
	public String toString()
	{
		String str="";
		if(head == null)
		{
			str="Empty.............................";
		}
		else
		{
			Node it=head;
			while(it != null)
			{
				str += it.data+"  ,";
				it=it.next;
			}
		}
		return str;
	}
	
	
	
	
	
	
	
	

}
