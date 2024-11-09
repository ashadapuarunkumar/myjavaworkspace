
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
	
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> h =new LinkedHashSet<>();
		
		System.out.println(h.isEmpty());
		h.add(100);
		h.add(200);
		h.add(300);
		h.add(400);
		h.add(500);
		
		System.out.println(h);
		
		h.add(null);
		System.out.println(h);
		
		h.add(100);
		System.out.println(h);
		
		h.addFirst(222);
		h.addLast(999);
		
		boolean existed=h.contains(110);
		System.out.println(existed);
		
		System.out.println(h.isEmpty());
		
		System.out.println(h.remove(100));
		System.out.println(h);
		
		h.removeFirst();
		h.removeLast();
		System.out.println(h);
		
//		boolean existed=h.contains(100);
//		System.out.println(existed);
		
	}

}
