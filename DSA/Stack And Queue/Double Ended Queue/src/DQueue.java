
public class DQueue 
{
	private int[] arr;
	private int Front;
	private int Rear;
	public DQueue() {}
	public DQueue(int size)
	{
		this.arr=new int[size];
		this.Front=-1;
		this.Rear=-1;
	}

	public void insertR(int value)
	{
		if(this.Front==-1)
		{
			this.Front =0;
			this.Rear =0;
		}
		else if(this.Front==0 && this.Rear==this.arr.length-1)
		{
			System.out.println("DeQueue if Full");
		}
		else
		{
			if(this.Rear != this.arr.length-1)
			{
				this.Rear++;
				this.arr[this.Rear]=value;
			}
			else // Shifting remaining elements to front side
			{
				this.Front--;

				for(int i=this.Front ; i<this.Rear ; i++)
				{
					this.arr[i]=this.arr[i+1];
				}
				this.arr[this.Rear ]=value;
			}
		}
		System.out.println(this);
	}

	public void insertF(int value)
	{
		if(this.Front==-1)
		{
			this.Front =0;
			this.Rear =0;
			//this.arr[this.Front]=value;
		}
		else if(this.Front==0 && this.Rear==this.arr.length-1)
		{
			System.out.println("deQueu is Full");
		}
		else
		{
			if(this.Front != 0)
			{
				this.Front--;
				//this.arr[this.Front]=value;
			}
			else
			{
				this.Rear++;
				// Shifting elements to rear side
				for(int i=this.Rear;i>this.Front;i--)
				{
					this.arr[i]=this.arr[i-1];			
				}
				//this.arr[this.Front]=value;
			}
		}
		this.arr[this.Front]=value;
		System.out.println(this);
	}

	public int deleteR()
	{
		int value=0;
		if(this.Rear != -1)
		{
			value = this.arr[this.Rear];

			if(this.Front != this.Rear)
			{
				this.Rear--;
			}
			else 
			{
				this.Front=-1 ;
				this.Rear=-1  ;
			}
		}
		else
		{
			System.out.println("The DeQueue is Empty");
		}

		return value;
	}

	public int deleteF()
	{
		int value=0;
		if(this.Front != -1)
		{
			value = this.arr[this.Front];

			if(this.Front != this.Rear)
			{
				this.Front++;
			}
			else 
			{
				this.Front=-1 ;
				this.Rear=-1  ;
			}
		}
		else
		{
			System.out.println("The DeQueue is Empty");
		}

		return value;


	}

	public String toString() 
	{
		String str="";
		if(this.Front==-1)
		{
			str= "DeQueue is Empty";
		}
		else
		{
			for(int i=this.Front;i<this.Rear;i++)
			{
				str = str + this.arr[i]+ "  ,";	
			}

		}
		return str;

	}

}
