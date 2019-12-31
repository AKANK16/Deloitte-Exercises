import java.util.*;

public class CountChar {
	
	static char[] array= new char[8];
	Scanner sc= new Scanner(System.in);
	
	public static Map<Character, Integer> countCharachter(){
		
		Map <Character, Integer> map = new HashMap<>();
		int len=array.length;
		
		for (int k=0; k<len;k++)		{
			if( map.containsKey(array[k]) ){
				map.put(array[k], (map.get(array[k])+1) );
			}
			else 
				map.put(array[k], 1);			
		}
		
		System.out.println("/nPrinting charachter count");
        map.forEach((k,v) -> System.out.println(k + " - " + v));

		return map;
}	 
	
	public static void getArray(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter charachters in the array:");
	
		for(int i=0; i<8;i++)
		{
			array[i]=sc.next().charAt(0);
		}
	 }
	
	public static void main(String[] args){

		Map <Character, Integer> map = new HashMap<>();

		 getArray();
		map=countCharachter();
	
	}
}
