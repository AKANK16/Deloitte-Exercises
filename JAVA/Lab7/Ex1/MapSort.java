/*import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;*/

import java.util.*;

public class MapSort {

	public static void main(String[] args){
		
	Map <Integer, String> map = new HashMap<>();
	map.put(1,"Abdul");
	map.put(2, "Shivani");
	map.put(3,"Akanksha");
	
	
	System.out.println(getValues(map));

}
	
public static ArrayList getValues(Map<Integer, String> m){
	
	ArrayList l= new ArrayList<String>();
	
	for(Map.Entry<Integer, String> e : m.entrySet()){
		l.add(e.getValue());
	}
	
	Collections.sort(l);
	
	return l;
	}
}

