

import java.util.*;


public class TraversalDemo {
	

	public static void main(String[] args) {
		ArrayList<Double> a =new ArrayList<>();
		
		System.out.println(a.isEmpty());
		a.add(10000.0);
		a.add(210000.0);
		a.add(210000.0);
		a.add(4210000.0);
		a.add(200000.0);
		
		System.out.println(a);
		
		
		System.out.println("for loop....");
		for(int index=0;index<a.size();index++) {
			System.out.println(a.get(index));
		}
		System.out.println("for each loop......");
		for(Double aa:a) {
			System.out.println(aa);
		}
		System.out.println("forEach() from v1.8 with Method reference");
		a.forEach(System.out :: println);
		
		System.out.println("forEach() from v1.8 with Lamda Expressions");
		a.forEach((aa) ->System.out.println(aa));
		
		
		//nell values not allowed in treeset
//		h.add(null);
//		System.out.println(h);
		
		a.add(100.0);
		System.out.println(a);
		
		boolean existed=a.contains(110.0);
		System.out.println(existed);
		
//		System.out.println(h.isEmpty());
	
//		System.out.println(a.remove(100));
//		System.out.println(a);
//		boolean existed=h.contains(100);
//		System.out.println(existed);
		
	}

}
