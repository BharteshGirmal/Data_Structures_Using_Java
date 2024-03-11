
public class Hashing 
{
	LinkList[] str;
	
	public Hashing(int size)
	{
		str=new LinkList[size];
		for(int i=0;i<str.length;i++)
		{
			str[i]=new LinkList();
		}
	}

	public int HashFunction(String inputStr)
	{
		int sum=0;
		for(int i=0;i<inputStr.length();i++)
		{
			sum=sum+inputStr.charAt(i);
		}
		int index= sum % str.length;
		return index;
	}
	
	public void Insert(String InputStr)
	{
		int index=HashFunction(InputStr);
		System.out.println("The String "+InputStr+ " From "+index+ " index ");
		str[index].Append(InputStr);
		System.out.println(" is Placed at "+index+" index");
	}

	public void Remove(String InputStr)
	{
		int index=SearchString(InputStr);
		str[index].DeleteByValue(InputStr);
		System.out.println("The String "+InputStr+" is removed From "+index+" index");
	}

	private int SearchString(String InputStr)
	{
		int index=HashFunction(InputStr);
		return index;
	}	

}
