
public class Student 
{

	String name;
	int age;
	char gender;
	
	Student(String name, int age, char gender) 
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString() 
	{
		String str = name + ":" + age + ":" + gender;
		return str;
	}

}
