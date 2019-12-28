import java.util.Scanner;

public class Power {

	static boolean checkNumber(int n)
	{
		
		while(n>1)
		{
			if(n%2 == 0 )
			{
				n = n/2;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N:");
		int n = sc.nextInt();
		
		System.out.println("Power of two : " + checkNumber(n) ) ;
		
		sc.close();
		
		
		
		
		
	}

}
