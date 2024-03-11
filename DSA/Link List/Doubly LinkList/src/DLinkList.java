
public class DLinkList 
{
	Node head;
	Node tail;

	public DLinkList()
	{
		this.head = null;
		this.tail=null;
	}

	public void InsertFirst(int data)
	{
		Node newnode=new Node(data);
		if(this.head == null)
		{
			this.head=newnode;
			this.tail=newnode;
		}
		else
		{
			this.head.prev=newnode;
			newnode.next=this.head;
			this.head=newnode;
		}
	}

	public void InsertLast(int data)
	{
		Node newnode = new Node(data);
		if(this.tail == null)
		{
			this.head=newnode;
			this.tail=newnode;
		}
		else
		{
			this.tail.next=newnode;
			newnode.prev=this.tail;
			this.tail=newnode;
		}

	}

	private int getNodeCount()
	{
		int count=0;
		Node it=head;
		while(it!=null)
		{
			count++;
			it=it.next;
		}
		return count;
	}

	public void  insert_by_position(int pos,int data)
	{
		Node newnode=new Node(data);
		if(pos==1)
		{
			InsertFirst(data);
		}
		else if(pos==getNodeCount()+1)
		{
			InsertLast(data);
		}
		else if(pos>1 && pos< getNodeCount()+1)
		{
			Node it=head;
			for(int i=1;i<pos-1;i++)
			{
				it=it.next;
			}	
			/*Node tmp=it.next;
			it.next=newnode;
			newnode.pre=it;
			newnode.next=tmp;
			tmp.pre=newnode;
			 */
			newnode.next=it.next;
			newnode.prev=it;
			newnode.next.prev=newnode;
			it.next=newnode;
		}

	}


	public void DeleteFirst()
	{
		Node it =this.head;
		if(this.head == null)
		{
			System.out.println("DLinkList is Empty");
		}
		else
		{
			//for 1 node
			if(this.head.next == null)
			{
				this.head=null;
				this.tail=null;
			}
			else
			{
				this.head=it.next;
				this.head.prev=null;
				it.next=null;
			}
		}
	}

	public void DeleteLast()
	{
		if(this.tail== null)
		{
			System.out.println("DLinkList is Empty");
		}
		else
		{
			//if we have only one node.
			if(this.tail.prev == null)
				// this.head.next == null;
				// this.head == this.tail;	
			{
				this.head = null;
				this.tail = null;
			}
			else
			{
				// more than 1 node using tail
				Node it=tail;
				tail.prev.next=null;
				tail=tail.prev;
				it.prev=null;
			}
		}
	}

	private int GetLinkListLength()
	{
		int Count=0;
		Node it =this.head;
		while(it != null)
		{
			Count++;
			it = it.next;
		}
		return Count;
	}



	public void DeleteByPos(int value , int pos)
	{
		int count = GetLinkListLength();
		if(pos == 1)
		{
			DeleteFirst();
		}
		else if(pos == count+1)
		{
			DeleteLast();
		}
		else if(pos>1 && pos<count+1)
		{
			Node it=this.head;
			for(int i=1;i<pos-1;i++)
			{
				it=it.next;
			}
			Node t=it.next;
			it.next=it.next.next;
			t.prev=null;
			t.next=null;
		}
		else
		{
			System.out.println("Invalid Position");
		}

	}


	public void ReversePrint()
	{
		if(this.tail == null)
		{
			System.out.println("Doubly Link List is Empty");
		}
		else
		{
			Node it=this.tail;
			while(it != null)
			{
				System.out.print(it.data+"  ,");
				it=it.prev;
			}
		}
		System.out.println();
	}

	public void PrintForward()
	{
		if(this.head == null)
		{
			System.out.println("Doubly Link List is Empty ");
		}
		else
		{
			Node it = this.head;

			while(it != null)
			{
				System.out.print( it.data+"  ,");
				it = it.next;
			}
		}
		System.out.println();
	}


	public String toString()
	{
		String str="";
		if(this.head == null)
		{
			str="Doubly LinkList is Empty";
		}
		else
		{
			Node it=this.head;
			while(it != null)
			{
				str=str+it.data+"  ,";
				it=it.next;
			}
		}
		return str;
	}


}
