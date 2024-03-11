
public class Stack 
{
	private Student []arr;
	private int top;
	
	public Stack() 
	{
		this.arr= new Student[5];
		this.top=-1;
	}
	
	public Stack(int size) 
	{
		this.arr= new Student[size];
		this.top=-1;
	}
	
	public void push(Student s)
	{
		if(this.top < this.arr.length-1)
		{
			this.top++;
			this.arr[this.top]=s;
		}
		else
		{
			System.out.println("The Stack is Full \n Stack Overflow");
		}
	}
	
	public Student pop()
	{
		if(this.top != -1 )
		{
			Student value = this.arr[this.top];
			this.top--;
			return value;
		}
		else
		{
			System.out.println("The stack is Empty \n Stack Underflow");
			return null;
		}
	}
	
	public String toString()
	{
		String str ="";
		if(this.top == -1)
		{
			str ="Stack Empty";
		}
		else
		{
			for(int i = this.top ;i>=0;i--)
			{
				str = str + this.arr[i]+ "  ,";
			}
		}
		return str;
	}

}
