import java.util.Scanner;

public class Diff {

	
	static int calculateDiff(int n)
	{
		int diff=0, sumOfSquares=0, squareOfSums=0 ;
		 
		for(int i=1;i<=n; i++)
		{	
			sumOfSquares= sumOfSquares + (i*i);
		}
		
		for(int j=1; j<=n ; j++)
		{
			squareOfSums= squareOfSums + j;
		}
		
		squareOfSums = squareOfSums * squareOfSums ;
		
		diff = sumOfSquares - squareOfSums ;
		
		return diff;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N:");
		int n = sc.nextInt();
		
		System.out.println("Diff : " + calculateDiff(n) ) ;
		
		sc.close();
		
		
	}

}
