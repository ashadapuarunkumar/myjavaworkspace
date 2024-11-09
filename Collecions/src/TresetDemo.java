

import java.util.Comparator;
import java.util.TreeSet;

public class TresetDemo {
	

	public static void main(String[] args) {
		TreeSet<Integer> h =new TreeSet<>(Comparator.reverseOrder());
		
		System.out.println(h.isEmpty());
		h.add(100);
		h.add(200);
		h.add(300);
		h.add(400);
		h.add(500);
		
		System.out.println(h);
		//nell values not allowed in treeset
//		h.add(null);
//		System.out.println(h);
		
		h.add(100);
		System.out.println(h);
		
		boolean existed=h.contains(110);
		System.out.println(existed);
		
//		System.out.println(h.isEmpty());
		
		System.out.println(h.remove(100));
		System.out.println(h);
//		boolean existed=h.contains(100);
//		System.out.println(existed);
		
	}

}
