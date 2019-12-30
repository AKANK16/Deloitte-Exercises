
public class EmployeeApp {

static Employee emp[]=new Employee[3];
	
	public static void main(String[] args) {
		
		Employee emp1,emp2,emp3;

		
		emp1=new Employee(12,"AAA","BBB",21);
		emp2=new Employee(23,"jjj","kkk",43);
		emp3=new Employee(212,"rrr","mmm",28);
		
		try {
			addEmp(emp1);
			addEmp(emp2);
			addEmp(emp3);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
		for(int k=0; k<emp.length; k++)
		{
			System.out.println(emp[k]);	
		}		
	}
	
	public static boolean isStringAcceptable(String str)
	{
		return((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")));
	}
	
	public static void addEmp(Employee e) throws NameException
	{
		if(!isStringAcceptable(e.firstName) || !isStringAcceptable(e.lastName) )
			throw new NameException("First Name and Last Name is same");
		
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i]==null)
			{
				emp[i]=e;
				return;
			}
		}
	}	
}
