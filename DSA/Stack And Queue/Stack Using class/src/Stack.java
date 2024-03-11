
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
		if(top == -1)
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
