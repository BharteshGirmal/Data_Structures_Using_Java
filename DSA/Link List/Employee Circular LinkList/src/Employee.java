
public class Employee 
{
	String Name;
	int Age;
	float Salary;
	
	public Employee() {} // Parameterless
	
	public Employee(String Name , int Age , float Salary)
	{
		this.Name=Name;
		this.Age=Age;
		this.Salary=Salary;
	}
	
	public String toString()
	{
		String str= "Name : "+Name+"\nAge : "+Age+"\nSalary : "+Salary+"\n";
		return str;
	}

}
