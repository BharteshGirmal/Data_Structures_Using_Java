
public class Main 
{

	public static void main(String[] args) 
	{
		Hashing Hash=new Hashing(25);
		Hash.Insert("Bhartesh");
		Hash.Insert("Girmal");
		Hash.Insert("Pooja");
		Hash.Insert("Bhartesh");
		Hash.Insert("Hitesh");
		Hash.Insert("Pankaj");
		Hash.Insert("Akshay");
		
		Hash.Remove("Bhartesh");
		Hash.Remove("Bhartesh");
		Hash.Remove("Girmal");
		Hash.Remove("Pooja");
		Hash.Remove("Pankaj");
		Hash.Remove("Bhartesh");
	
		
		System.out.println(Hash);
		

	}

}
