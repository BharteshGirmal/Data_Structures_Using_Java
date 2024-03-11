
public class CQueue 
{
	private int[] arr;
	private int Front;
	private int Rear;
	public CQueue() {} //Parameterless
	public CQueue(int size) //Parameterized
	{
		this.arr=new int[size];
		this.Front=-1;
		this.Rear=-1;
	}

	public void insert(int value) 
	{
		if(this.Front==-1)
		{
			this.Front++;
		}
		
		if(this.Rear<this.arr.length-1)
		{
			this.Rear++;
			this.arr[this.Front]=value;
		}
		else
		{
			if(this.Rear+1==this.arr.length-1 && this.Front != -1)
			{
				this.Rear=0;
				this.arr[this.Front]=value;
			}
			else
			{
				System.out.println("Cicrular Queue is Full");
			}
		}

	}

	public int delete()
	{
		int value=0;
		if(this.Front==-1 && this.Rear==-1)
		{
			System.out.println("Circular Queue is Empty");
		}
		else if(this.Front != this.Rear)
		{
			value=this.arr[this.Front];

			if(this.Front !=this.arr.length-1)
			{
				this.Front++;
			}
			else
			{
				this.Front=0;
			}
		}
		else
		{
			this.Front =-1;
			this.Rear =-1;
		}
		return value;
	}
	
	public String toString()
	{
		String str ="";
		if(this.Front==-1 && this.Rear==-1)
		{
			str="Circular Queue is Empty";
		}
		else
		{
			for(int i=this.Front ; i<=this.Rear ; i++)
			{
				str = str + this.arr[i]+ "   ,";
			}
			
		}
		return str;
	}

}
