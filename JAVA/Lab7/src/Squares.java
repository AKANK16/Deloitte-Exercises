import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Squares {
	
	static int[] array= new int[8];
	Scanner sc= new Scanner(System.in);
	
public static Map<Integer, Integer> getSquares(){
		
		Map <Integer, Integer> map = new HashMap<>();
		int len=array.length;
		for (int k=0; k<len;k++){
				map.put(array[k], (array[k])*(array[k]));
			}
		return map;
}	 
	
public static void printMap(Map<Integer, Integer> map)
{	
	System.out.println("\nPrinting map");
	map.forEach((k,v) -> System.out.println(k + " - " + v));
}

	public static void getArray(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers in the array:");
		for(int i=0; i<8;i++){
			array[i]=sc.nextInt(); }
	 }
	
	public static void main(String[] args){
		Map <Integer, Integer> map = new HashMap<>();
		getArray();
		map=getSquares();
		printMap(map);
	}
}
