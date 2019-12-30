

public class Employee {
	int empID;
	String firstName;
	String lastName;
	int age;
	
	public Employee(int empID, String firstName, String lastName, int age)
	{
		this.empID= empID;
		this.firstName= firstName; 
		this.lastName= lastName;
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
	
	public String getFirstName()
	{
		return firstName;
	}
	
	
	public void setFirstName(String fisrtName)
	{
		this.firstName=firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	return "Employee [empID=" + empID + ", fisrtName=" + firstName + ", lastName="
			+ lastName + " age=" + age + "]\n";
}
	
	
}