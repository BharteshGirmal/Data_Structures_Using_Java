import javax.xml.stream.util.EventReaderDelegate;

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

	public void Insert1(int data)
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

	public void Append(int data) // Insert at last position
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
				while(trav.next.next != null)
				{
					trav=trav.next;
				}
				trav.next=null;	
			}
		}
	}


	private int GetNodeCount()  // Function to find out the number of nodes 
	{
		int Count=0;
		Node trav=this.head;
		while(trav != null)
		{
			Count++;
			trav=trav.next;
		}
		return Count;
	}

	public void InsertByPos(int value,int pos)
	{
		int Count=GetNodeCount();
		Node temp = new Node();
		Node trav=this.head;
		if(pos==1)
		{
			Insert1(value);
		}
		else if(pos==Count+1)
		{
			Append(value);
		}
		else if(pos>0 && pos < Count+1)
		{
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.next;
			}
			temp.next=trav.next;
			trav.next=temp;
		}
		else
		{
			System.out.println("Invalid Position of Node");
		}

	}


	public void DeleteByPos( int pos)
	{
		int Count=GetNodeCount();
		if(pos==1)
		{
			DeleteFirst();
		}
		else if(pos==Count+1)
		{
			DeleteLast();
		}
		else if(pos>0 && pos <Count+1)
		{
			Node trav=this.head;
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.next;
			}

			Node it=trav.next;
			trav.next=it.next;
			it.next=null;
		}
		else
		{
			System.out.println("Invalid Position of Node");
		}
	}

	public void ReversePrint()
	{
		ReverseRecursion(this.head);
		System.out.println();
	}

	private void ReverseRecursion(Node trav)
	{
		if(trav!= null) 
		{
			ReverseRecursion(trav.next);
			System.out.print(trav.data+"  ,");
		}
	}

	public void ReverseLinkList()
	{
		System.out.println("Link List Reversed : ...................");
		Node trav= this.head;
		Node travprev = null;
		Node travnxt =this.head;
		
		while(trav != null)
		{
			travnxt=trav.next;
			trav.next=travprev;
			travprev=trav;
			trav=travnxt;
		}
		this.head=travprev;
	}
	
	public void OddLinklist()
	{
		if(this.head==null)
		{
			System.out.println("Link List is empty");
		}
		else
		{
			Node trav=this.head;
			System.out.println("Odd Data Of LinkList : ");
			while(trav!= null)
			{
				if(trav.data % 2 != 0)
				{
					System.out.print(trav.data+"  ,");
				}
				trav=trav.next;
			}
			System.out.println();
		}
	}
	
	public void EvenLinklist()
	{
		if(this.head==null)
		{
			System.out.println("Link List is empty");
		}
		else
		{
			Node trav=this.head;
			System.out.println("Even Data Of LinkList : ");
			while(trav!= null)
			{
				if(trav.data % 2 == 0)
				{
					System.out.print(trav.data+"  ,");
				}
				trav=trav.next;
			}
			System.out.println();
		}
	}
	

	public void BiggestElement()
	{
		if(this.head == null)
		{
			System.out.println("Empty.....................");
		}
		else
		{
			Node trav=this.head;
			int max = trav.data;
			while(trav != null)
			{
				if(max < trav.data)
				{
					max=trav.data;
				}
				trav=trav.next;
			}
			System.out.println("The biggest Element in the Link List is :  "+max);
		}
	}
	
	public void SmallestElement()
	{
		if(this.head == null)
		{
			System.out.println("Empty.....................");
		}
		else
		{
			Node trav=this.head;
			int min = trav.data;
			while(trav != null)
			{
				if(min > trav.data)
				{
					min=trav.data;
				}
				trav=trav.next;
			}
			System.out.println("The Smallest Element in the Link List is :  "+min);
		}
	}
	
	public void InsertByValue(int value , int data)
	{
		Node trav= this.head;
		Node newnode = new Node(value); 
		while(trav != null)
		{
			if(trav.data == value)
			{
				newnode.next=trav.next;
				trav.next=newnode;
			}
			trav = trav.next;
		}
	}
	
	public String toString()
	{
		String str="";
		if(head == null)
		{
			str = "LinkList is Empty";
		}
		else
		{
			Node trav=this.head;
			while(trav != null)
			{
				str += trav.data+ "  ,";
				trav=trav.next;
			}
		}
		System.out.println();
		return str;
	}
}
