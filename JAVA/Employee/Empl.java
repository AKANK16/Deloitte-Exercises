
public class Empl implements Comparable{
	int empID;
	String Name;
	String Designation;
	
	public Empl(int empID, String Name, String Designation)
	{
		this.empID= empID;
		this.Name= Name; 
		this.Designation= Designation;
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
	
	@Override
	public int compareTo(Object o)
	{
		Empl E= (Empl) o;
		String des1 = E.getDesignation();
		String des2= this.getDesignation();
		
		return des1.compareTo(des2);
	}
	
@Override
public String toString()
{
	return "Employee [empID=" + empID + ", name=" + Name + ", designation="
			+ Designation + "]\n";
}
	
	
}
