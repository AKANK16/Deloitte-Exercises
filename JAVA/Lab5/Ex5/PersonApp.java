
public class PersonApp {
	
	static Person p[]=new Person[3];
	
	public static void main(String[] args) {
		
		Person p1,p2,p3;
	
		p1=new Person("AAA",21);
		p2=new Person("jjj",43);
		p3=new Person("rrr",8);
		
		try {
			addPerson(p1);
			addPerson(p2);
			addPerson(p3);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		
		for(int k=0; k<p.length; k++)
		{
			System.out.println(p[k]);
			
		}
			
	}
	
	public static void addPerson(Person e) throws PersonAgeException
	{
		if(e.getAge()< 15)
			throw new PersonAgeException("Age must be greater than 15");
	
		for(int i=0;i<p.length;i++)
		{
			if(p[i]==null)
			{
				p[i]=e;
				return;
			}
		}
	
		
	}
	
}

