 

public class Employee {
	int empID;
	String Name;
	String Designation;
	int age;
	
	public Employee(int empID, String Name, String Designation, int age)
	{
		this.empID= empID;
		this.Name= Name; 
		this.Designation= Designation;
		this.age = age;
	}

	public int getAge()
	{
		return age;
	
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getEmpID()
	{
		return empID;
	}
	
	public void setEmpId(int EmpID)
	{
		this.empID= EmpID;
	}
	
	public String getName()
	{
		return Name;
	}
	
	
	public void setName(String name)
	{
		this.Name=name;
	}
	
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}
	
/*	@Override
	public int compareTo(Object o)
	{
		Employee E= (Employee) o;
		String des1 = E.getDesignation();
		String des2= this.getDesignation();
		
		return des1.compareTo(des2);
	}
	*/
@Override
public String toString()
{
	return "Employee [empID=" + empID + ", name=" + Name + ", designation="
			+ Designation + " age=" + age + "]\n";
}
	
	
}


