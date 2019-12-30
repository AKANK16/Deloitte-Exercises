
public class EmpAgeException extends Exception {
	private String msg;
	
	public EmpAgeException()
	{
		
	}
	public EmpAgeException(String msg)
	{
		this.msg= msg;
	}
	
	public String toString()
	{
		if(msg==null)
			return "Age should be more than 18....";
		else 
			return msg;
	}
	
}
