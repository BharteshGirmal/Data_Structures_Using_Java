
public class LinkList 
{
	private Node head;

	public LinkList()
	{
		this.head=null;
	}

	public LinkList(Node head)
	{
		this.head=head;
	}

	public void Insert1(Employee data)
	{
		Node newnode = new Node(data);

		if(this.head==null) // for empty condition
		{
			this.head=newnode;
		}
		else
		{
			newnode.next=this.head;
			this.head=newnode;	
		}
	}

	public void Append(Employee data) // Insert at last position
	{
		Node newnode = new Node(data);
		if(this.head == null)
		{
			this.head=newnode;
		}
		else
		{
			Node trav=this.head;
			while(trav.next != null)
			{
				trav=trav.next;
			}
			trav.next=newnode;
			newnode.next=null ; // By default it is null 
		}
	}

	public void DeleteFirst()
	{
		if(this.head == null)
		{
			System.out.println("LinkList is Empty");
		}
		else
		{
			if(this.head.next == null)
			{
				this.head=null;
			}
			else
			{
				Node trav=this.head;
				this.head= trav.next;
				trav.next=null;	
			}
		}
	}

	public void DeleteLast()
	{
		if(this.head == null)
		{
			System.out.println("LinkList is Empty");
		}
		else
		{
			if(this.head.next == null)
			{
				this.head=null;
			}
			else
			{
				Node trav=this.head;
				while(trav != null)
				{
					trav=trav.next;
				}
				Node it = trav.next;
				trav.next=it.next;
				it.next=null;
			}
		}
	}

	public String toString()
	{
		String str="";
		if(this.head == null)
		{
			str = "LinkList is Empty";
		}
		else
		{
			Node trav=this.head;
			while(trav != null)
			{
				str += trav.data.toString();
				trav=trav.next;
			}
		}
		System.out.println();
		return str;
	}
}
