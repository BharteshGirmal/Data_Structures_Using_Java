
public class CicularLinkList 
{
	Node head;

	public CicularLinkList()
	{
		head=null;
	}

	public void InsertFirst(int data)
	{
		Node newnode = new Node(data);
		if(head == null)
		{
			head=newnode;
			head.next=head;
		}
		else 
		{	
			Node it=head;
			while(it.next != head)
			{
				it=it.next;
			}
			it.next=newnode;
			newnode.next=head;
			head=newnode;
		}
	}

	public void Append(int data)
	{
		Node newnode= new Node(data);
		if(head == null)
		{
			head=newnode;
			head.next=head;
		}
		else
		{
			Node it = head;
			while(it.next != head)
			{
				it=it.next;
			}
			it.next=newnode;
			newnode.next=head;
		}
	}

	private int GetCount()
	{
		int count=0;
		Node it =head;
		while(it.next != head)
		{
			count++;
			it=it.next;
		}
		return count;
	}

	public void InsertByPos(int data,int pos)
	{
		int count=GetCount();
		if(pos == 1)
		{
			InsertFirst(data);
		}
		else if(pos == count+1)
		{
			Append(data);
		}
		else if(pos >1 && pos< count+1)
		{
			Node newnode=new Node(data);
			Node it=head;
			for(int i=1;i<pos-1;i++)
			{
				it=it.next;
			}

			newnode.next=it.next;
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
			System.out.println("Circular LinkList is Empty........................");
		}
		else if(head.next==head) // For 1 Node
		{
			head.next=null;
			head=null;
		}
		else
		{
			Node it = head;
			while(it.next != head)
			{
				it=it.next;
			}
			Node temp= head;
			head=head.next;
			it.next=head;
			temp.next=null;
		}
	}

	public void DeleteLast()
	{
		if(head == null)
		{
			System.out.println("Circular LinkList is Empty........................");
		}
		else if(head.next==head) // For 1 Node
		{
			head.next=null;
			head=null;
		}
		else
		{
			Node it=head;
			while(it.next.next != head)
			{
				it=it.next;
			}
			Node temp = it.next;
			it.next=head;
			temp.next=null;
		}
	}


	public void DeleteByPos(int pos)
	{
		int count=GetCount();
		if(pos == 1)
		{
			DeleteFirst();
		}
		else if(pos == count+1)
		{
			DeleteLast();
		}
		else if(pos > 1 && pos < count+1)
		{
			Node it=head;
			while(it.next != head)
			{
				it=it.next;
			}
			Node temp=it.next;
			it.next=temp.next;
			temp=null;

		}
		else
		{
			System.out.println("Invalid Position");
		}
	}
	
	

	public String toString()
	{
		String str="";
		if(head==null)
		{
			str = "Empty ....................................";
		}
		else
		{
			str += head.data+"    ";
			Node it=head.next;
			while(it != head)
			{
				str += it.data+ "    ";
				it=it.next;
			}
		}
		return str;
	}




}
