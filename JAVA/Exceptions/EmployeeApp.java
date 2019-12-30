import java.util.Arrays;


public class EmployeeApp {
	
	static Employee emp[]=new Employee[3];
	
	public static void main(String[] args) {
		
		Employee emp1,emp2,emp3;

		
		emp1=new Employee(12,"AAA","HR",21);
		emp2=new Employee(23,"jjj","Coder",43);
		emp3=new Employee(212,"rrr","Coder",28);
		
		try {
			addEmp(emp1);
			addEmp(emp2);
			addEmp(emp3);
			addEmp(emp1);
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
	
	public static void addEmp(Employee e) throws BankCountException, EmpAgeException
	{
		if(e.getAge()< 18)
			throw new EmpAgeException("Age must be greater than 18");
		
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i]==null)
			{
				emp[i]=e;
				return;
			}
		}
		throw new BankCountException(" Space full!");
	}
	
}




