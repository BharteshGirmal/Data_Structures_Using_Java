
public class Stack 
{
	private int top ;
	private int []arr;
	public Stack()
	{
		this.arr = new int[5];
		this.top =-1;
	}

	public Stack(int size )
	{
		this.arr = new int[size];
		this.top =-1;
	}

	public void push( int x)
	{
		if(this.top == arr.length-1)
		{
			System.out.println("The stack is Full");
		}
		else
		{
			this.top++;
			arr[this.top]=x;
			
		}
	}

	public  int pop()
	{
		if(this.top == -1)
		{
			System.out.println("The Stack is Empty");
			return 0;
		}
		else
		{
			int value = this.arr[this.top];
			this.top--;
			return value;
		}
	}
	
	public Stack concat(Stack x)
	{
		Stack y = new Stack();
		for(int i=0;i<=this.top;i++)
		{
			y.push(this.arr[i]);
		}
		for(int j=0; j<=x.top;j++)
		{
			y.push(x.arr[j]);
		}
		return y;
	}
	
	public boolean Equals(Stack s)
	{
		if(this.arr.length != s.top)
		{
			return false;
		}
		if(this.top != s.top)
		{
			return false ;
		}
		for(int i=0;i<this.top;i++)
		{
			if(this.arr[i] != s.arr[i]))
				return false ;
		}
		return true ;
	}

	public String toString()
	{
		String str="";
		if(this.top == -1)
		{
			System.out.println("No Elements to Add Stack Empty");
		}
		else
		{
			for(int i=this.top;i>=0;i--)
			{
				str=str +this.arr[i]+ "  ,";
			}
		}
		return str;
	}

}
