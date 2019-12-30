
public class NameException extends Exception {
	private String msg;
	
	public NameException()
	{
		
	}
	public NameException(String msg)
	{
		this.msg= msg;
	}
	
	public String toString()
	{
		if(msg==null)
			return "First Name and Last Name should be same";
		else 
			return msg;
	}
	
}