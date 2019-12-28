import java.util.Scanner;


public class Sum {
	
	static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1; i<=n ; i++)
		{
			if(i % 3 == 0 || i % 5 == 0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N:");
		int n = sc.nextInt();
		
		System.out.println("Sum : " + calculateSum(n) ) ;
		
		sc.close();

	}

}
