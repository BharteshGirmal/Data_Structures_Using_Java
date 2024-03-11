
public class Student {

	private String Name;
	private int Age;
	private char Gender;
	private int Marks;
	
	public Student() //parameterless
	{
		this.Name="";
		this.Age=0;
		this.Gender='M';
	}
	              
	public String getName() {
		return Name;
	}

	public void setName(String name) 
	{
		Name = name;
	}

	public int getAge() 
	{
		return Age;
	}

	public void setAge(int age) 
	{
		Age = age;
	}

	public int getMarks() 
	{
		return Marks;
	}

	public void setMarks(int marks) 
	{
		Marks = marks;
	}

	public char getGender() {
		return Gender;
	}

	public void setGender(char gender) {
		Gender = gender;
	}

	public Student(String Name,int Age,char Gender,int Marks) //Parameterized
	{
		this.Name=Name;
		this.Age=Age;
		this.Gender=Gender;
		this.Marks=Marks;
	}
	
	void Print()
	{
		System.out.println("Name : "+this.Name);
		System.out.println("Age : "+this.Age);
		System.out.println("Gender : "+this.Gender);
		System.out.println("Marks : "+this.Marks);
		System.out.println("______________________________________________");
	}
	
}
