
public class EmployeeApp {

static Employee emp[]=new Employee[3];
	
	public static void main(String[] args) {
		
		Employee emp1,emp2,emp3;

		
		emp1=new Employee(12,"AAA","BBB",21000);
		emp2=new Employee(23,"jjj","kkk",43000);
		emp3=new Employee(212,"rrr","mmm",28000);
		
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
	

	public static void addEmp(Employee e) throws SalaryException
	{
		if(e.getSalary() < 3000 )
			throw new SalaryException("Salary is less than 3000");
		
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
