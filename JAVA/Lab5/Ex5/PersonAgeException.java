
public class PersonAgeException extends Exception{

	
		private String msg;
		
		public PersonAgeException()
		{
			
		}
		public PersonAgeException(String msg)
		{
			this.msg= msg;
		}
		
		public String toString()
		{
			if(msg==null)
				return "Age should be more than 16....";
			else 
				return msg;
		}
		
	}
	
	