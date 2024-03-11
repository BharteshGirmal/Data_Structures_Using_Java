import java.util.Currency;

public class BST 
{
	Node root;

	public BST()
	{
		this.root=null;
	}// end of function

	public void Insert(int data)
	{
		// NewNode created

		if(this.root == null)
		{
			Node temp=new Node(data);
			this.root=temp;
		}
		else
		{
			Node temp=new Node(data);
			Node it=this.root;

			while(true)
			{
				if(data < it.data) // Smaller values at Left Side
				{
					// Left Node checking for condition
					if(it.Left == null)
					{
						it.Left=temp;
						break;
					}
					else
						it=it.Left;
				}

				else if(data > it.data )
				{
					if(it.Right == null)
					{
						it.Right=temp;
						break;
					}
					else
						it=it.Right;
				}
				else
					break;
			}
		}
	}// end of function


	public void PreOrder()
	{
		System.out.println("PreOrder : ");
		PrintPreOrder(root);
		// Print - Left - Right
		System.out.println();
	}// end of function

	private void PrintPreOrder(Node it) //LPR
	{
		if(it !=null)
		{
			System.out.print(it.data+"  ,");
			PrintPreOrder(it.Left);
			PrintPreOrder(it.Right);
		}
	}// end of function

	public void InOrder()
	{
		System.out.println("InOrder : ");
		PrintInOrder(root);
		System.out.println();
	}// end of function

	private void PrintInOrder(Node it) //LPR
	{
		if(it !=null)
		{
			PrintInOrder(it.Left);
			System.out.print(it.data+"  ,");
			PrintInOrder(it.Right);
		}
	}// end of function

	public void PostOrder()
	{
		System.out.println("PostOrder : ");
		PrintPostOrder(root);
		System.out.println();
	}// end of function

	private void PrintPostOrder(Node it)
	{
		if(it !=null)
		{
			PrintPostOrder(it.Left);
			PrintPostOrder(it.Right);
			System.out.print(it.data+"  ,");
		}
	}// end of function

	public void PrintSmallest()
	{
		if(root == null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node it=root;
			while(it.Left !=null)
			{
				it=it.Left;
			}
			System.out.println("The Smallest Data is :"+it.data+"  ");
		}
	}// end of function

	public void PrintLargest()
	{
		if(root == null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node it=root;
			while(it.Right !=null)
			{
				it=it.Right;
			}
			System.out.println("The Largest Data is :"+it.data+"  ");
		}
	}// end of function

	public void Delete(int value)
	{
		DeleteOpration(root,value);
	}// end of function

	private Node DeleteOpration(Node CurRoot , int key)
	{
		if(CurRoot == null) // Empty Condition
		{
			return null;
		}

		if( key > CurRoot.data)
		{
			CurRoot.Right=DeleteOpration(CurRoot.Right, key);
			return CurRoot;
		}

		else if(key < CurRoot.data)
		{
			CurRoot.Left=DeleteOpration(CurRoot.Left, key);
			return CurRoot;
		}

		else
		{
			// Reached the Node
			if(CurRoot.Left == null)
			{
				Node temp=CurRoot.Right;
				CurRoot.Right=null;
				return temp;
			}
			else if(CurRoot.Right == null)
			{
				Node temp=CurRoot.Left;
				CurRoot.Left=null;
				return temp;
			}
			else
			{
				// Node having two Child 
				int x = GetSmallestvalue(CurRoot.Right);
				CurRoot.data = x;
				CurRoot.Right=DeleteOpration(CurRoot.Right, x);
			}
		}
		return CurRoot;

	} // end of function

	private int GetSmallestvalue(Node it)
	{
		while(it.Left !=null)
		{
			it=it.Left;
		}
		return it.data;
	}// end of function


	public int CalculateHeight()
	{
		return Height(root);
	}// end of function

	public int Height(Node CurRoot)
	{
		if(CurRoot == null)
		{
			return 0;
		}

		int Left = Height(CurRoot.Left); // Recursive Call
		int Right = Height(CurRoot.Right);
		
		return Maximum(Left,Right)+1;

	}// end of function

	public int Maximum(int left , int right)
	{
		if(left > right)
		{
			return left;
		}
		else
		{
			return right;
		}
	}// end of function

} // end of class










