

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap <Integer,String> tm=new TreeMap<>();
		tm.put(1001, "Amar");
		tm.put(1002, "Sriman");
		tm.put(1003, "ramu");
		
		System.out.println(tm);
		
		tm.put(1002, "war");
		System.out.println(tm);
		
		
		Set<Integer>keys=tm.keySet();
		System.out.println(keys);    
		
		Collection<String> values=tm.values();
		System.out.println(values);
		
		for(Map.Entry<Integer, String> entry : tm.entrySet()) {
		System.out.println(entry);
		System.out.println(entry.getKey()+"..........."+entry.getValue());
		}
		
	}
}
