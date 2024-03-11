
public class CicularLinkList 
{
	Node head;

	public CicularLinkList()
	{
		head=null;
	}

	public void InsertFirst(int data)
	{
		Node newnode=new Node(data);
		if(head == null)
		{
			head=newnode;
			head.next=head;
		}
		else
		{
			Node it=head;
			while(it.next != head) // Circular Condition
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
		Node newnode=new Node(data);
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
		}
	}

	private int GetNodeCount()
	{
		int Count=0;
		Node it =head;
		while(it.next != head)
		{
			Count++;
			it=it.next;
		}
		return Count;
	}

	public void InsertByPos(int data, int pos)
	{
		int count = GetNodeCount();
		if(pos == 1)
		{
			InsertFirst(data);
		}
		else if(pos == count+1)
		{
			Append(data);
		}
		else if(pos > 1 && pos < count+1)
		{
			Node newnode=new Node(data);
			Node it =head;
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
		if(head==null)
		{
			System.out.println("CLL is Empty......................");
		}
		else if(head.next == head) // 1 node
		{
			head.next=null;
			head=null;
		}
		else
		{
			Node it=head;
			while(it.next != head)
			{
				it=it.next;
			}
			Node temp=head; // backup of head
			head=head.next;//head will point to next node
			it.next=head; // head will point to it next
			temp.next=null; // head is getting null;
		}
	}

	public void DeleteLast()
	{
		if(head==null)
		{
			System.out.println("CLL is Empty......................");
		}
		else if(head.next == head) // 1 node
		{
			head.next=null;
			head=null;
		}
		else
		{
			Node it=head;
			while(it.next != head)
			{
				it=it.next;
			}
			Node temp=it.next;//taking backup of last node
			it.next=head;
			temp.next=null;
		}
	}
	
	public void DeleteByPos(int pos)
	{
		int count = GetNodeCount();
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
			Node it =head;
			for(int i=1;i<pos-1;i++)
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
	
	public void OddData()
	{
		if(head == null)
		{
			System.out.println("No Data .......................");
		}
		else
		{
			System.out.println("Printing Odd Data Of LinkList");
			Node it=head;
			while(it.next != head)
			{
				if(it.data % 2 != 0)
				{
					System.out.print(it.data+"   ,");
					it=it.next;
				}
			}
		}
		System.out.println();
	}
	
	public void EvenData()
	{
		if(head == null)
		{
			System.out.println("No Data .......................");
		}
		else
		{
			Node it=head;
			System.out.println("Printing Even Data Of LinkList");
			while(it.next != head)
			{
				if(it.data % 2 == 0)
				{
					System.out.print(it.data+"   ,");
					it=it.next;
				}
			}
		}
		System.out.println();
	}
	
	public String toString()
	{
		String str="";
		if(head == null)
		{
			str=" Circular LinkList is Empty..............";
		}
		else
		{
			str+=head.data+"   ,";
			
			Node it=head.next;
			while(it.next != head)
			{
				str+= head.data+"  ,";
				it=it.next;
			}
		}
		return str;
	}

}
