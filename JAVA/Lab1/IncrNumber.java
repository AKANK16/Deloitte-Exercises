import java.util.Scanner;


public class IncrNumber {

	static boolean checkNumber(int n)
	{
		int flag = 0, temp1=0, temp2=0; 
		
		while(n>0)
		{
			temp2 = n % 10;
			if(temp2 > temp1)
				return false; 
			
			n=n/10;
			temp1=temp2;
		
		}
	
		
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N:");
		int n = sc.nextInt();
		
		System.out.println("Increasing Number ?? : " + checkNumber(n) ) ;
		
		sc.close();
		
		
	}

}
