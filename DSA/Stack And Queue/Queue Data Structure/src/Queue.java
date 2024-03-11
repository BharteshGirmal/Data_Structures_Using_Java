
public class Queue 
{
	private int []arr;
	private int Front;
	private int Rear;

	public Queue() //Parameterless
	{
		this.arr= new int[5];
		this.Front=-1;
		this.Rear=-1;
	}

	public Queue(int size) // parameterised
	{
		this.arr = new int[size];
		this.Front=-1;
		this.Rear=-1;
	}

	public void insert(int value)
	{
		if(this.Front ==-1)
		{
			this.Front++;
		}

		if(this.Rear < this.arr.length-1)
		{
			this.Rear++;
			this.arr[this.Rear]=value;	
		}
		else
		{
			System.out.println("Queue Is Full");
		}
		System.out.println(this);
	}

	public int remove()
	{
		int value=0;
		if(this.Front==-1)
		{
			System.out.println("Queue Is Empty");
		}
		else
		{
			value=this.arr[this.Front];
			if(this.Front!=this.Rear)
			{
				this.Front++;
			}
			else
			{
				this.Front=this.Rear=-1;
			}
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
