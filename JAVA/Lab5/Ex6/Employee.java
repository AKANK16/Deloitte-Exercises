

public class Employee {
	int empID;
	String firstName;
	String lastName;
	int salary;
	
	public Employee(int empID, String firstName, String lastName, int salary)
	{
		this.empID= empID;
		this.firstName= firstName; 
		this.lastName= lastName;
		this.salary = salary;
	}

	public int getSalary()
	{
		return salary;
	
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
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
			+ lastName + " salary=" + salary + "]\n";
}
	
	
}