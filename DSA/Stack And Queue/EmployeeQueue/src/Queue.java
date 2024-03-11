
public class Queue 
{
	private Employee []arr;
	private int Front;
	private int Rear;

	public Queue() //Parameterless
	{
		this.arr= new Employee[5];
		this.Front=-1;
		this.Rear=-1;
	}

	public Queue(int size) // parameterised
	{
		this.arr = new Employee[size];
		this.Front=-1;
		this.Rear=-1;
	}

	public void insert(Employee value)
	{
		if(this.Rear < this.arr.length-1)
		{
			this.Rear++;
			this.arr[this.Rear]=value;

			if(this.Front ==-1)
			{
				this.Front++;
			}
		}
		else
		{
			System.out.println("Queue Is Full");
		}
		

	}

	public Employee remove()
	{
		Employee value=null;
		if(this.Front != -1)
		{
			value=this.arr[this.Front];
			
			if(this.Front != this.Rear)
			{
				this.Front++;
			}
			else
			{
				this.Front=this.Rear=-1;
			}
			
		}
		else
		{
			System.out.println("Queue Is Empty");
		}
		
		return value;	
	}

	public String toString()
	{
		String str="";
		if(this.Front == -1)
		{
			str = "Queue is empty";
		}
		else
		{
			for(int i=this.Front;i<=this.Rear;i++)
			{
				str = str + this.arr[i]+ "  ,";
			}
		}
		return str;
	}

}
