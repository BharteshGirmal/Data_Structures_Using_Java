
public class Employee 
{
	private int Empid=0;
	private String Name="";
	private float Salary=0f;
	
	
	public Employee() 
	{
		this.Empid=0;
		this.Name="";
		this.Salary=0f;
	}

	public Employee(int Empid,String Name,float Salary)
	{
		this.Empid=Empid;
		this.Name=Name;
		this.Salary=Salary;
	}

	public String toString()
	{
		String str="Employee Id : "+this.Empid+"\nEmployee Name : "+this.Name+"\nBasic Salray : "+this.Salary;
		return str;
	}

	public float Calsalray(float Salray)
	{
		float res = Salray+100;
		return res;
	}

	void SetSalary(float Salary)
	{
		this.Salary=Salary;
	}
	void SetEmpName(String Name)
	{
		this.Name=Name;
	}
	public String GetName()
	{
		return this.Name;
	}
	public float GetSalary()
	{
		return this.Salary;
	}
	void Display()
	{
		System.out.println("Employee Id :"+this.Empid);
		System.out.println("Employee Name :"+this.Name);
		System.out.println("Employee salary :"+this.Salary);
	}

}
