
public class Person {
	
	String Name;
	int age;

	public Person( String Name, int age)
	{
		this.Name= Name; 
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
	

	public String getName()
	{
		return Name;
	}
	
	
	public void setName(String name)
	{
		this.Name=name;
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
	return "Person [ name=" + Name + ",  age=" + age + "]\n";
}
	
}
