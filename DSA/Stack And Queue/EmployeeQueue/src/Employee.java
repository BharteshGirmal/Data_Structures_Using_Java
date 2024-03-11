
public class Employee 
{
	private int id ;
	private String name ;
	private float salary;
	
	public Employee( ) {}
	public Employee(int id , String name , float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		String str = "Employee Id = "+this.id+"\n Name = "+this.name+"\nSalary = "+this.salary;
		return str;
	}

}
