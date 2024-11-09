
import java.util.*;


public class CollectionDemo {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(33,22,44,11);
		System.out.println(l);
		
		
		
		Collections.sort(l);
		System.out.println(l);
		
		int index=Collections.binarySearch(l, 44);
		System.out.println(index);
		
		
		
		
	}
	
	
	
	
}
