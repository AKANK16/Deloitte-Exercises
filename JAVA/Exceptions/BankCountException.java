
public class BankCountException extends Exception{

	private String msg;
	public BankCountException()
	{
		
	}
	public BankCountException(String msg)
	{
		this.msg= msg;
	}
	
	public String toString()
	{
		if(msg==null)
			return "You can't add more than 10 Emplyees....";
		else 
			return msg;
	}
	
}
