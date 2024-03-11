
public class Student {

	String Name;
	int Age;
	char Gender;

	public Student()
	{
		Name="";
		Age=0;
		Gender='M';
	}
	public Student(String S)
	{
		Name=S;
		Age=0;
		Gender='M';
	}
	public Student(String N,int A,char G)
	{
		Name=N;
		Age=A;
		Gender=G;
	}


	public String toString()
	{
		String str="Name = "+Name+"\nAge = "+Age+"\nGender = "+Gender;
		return str;
	}
	
}
