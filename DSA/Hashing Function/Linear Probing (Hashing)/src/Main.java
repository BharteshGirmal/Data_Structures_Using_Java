
public class Main 
{

	public static void main(String[] args) 
	{
		Hashing Hash = new Hashing(15);
		Hash.Insert("Bhartesh");
		Hash.Insert("Girmal");
		Hash.Insert("Pankaj");
		Hash.Insert("Akshay");
		Hash.Insert("Bhartesh");
		Hash.Insert("Bhartesh");
		Hash.Insert("Bhartesh");
		Hash.Insert("Girmal");
		Hash.Remove("Bhartesh");
		Hash.Remove("Bhartesh");

	}

}
