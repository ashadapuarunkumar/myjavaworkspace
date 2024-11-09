

import java.util.*;

public class QueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue<>();
		p.offer("arjun");
		p.offer("alan");
		p.offer("amar");
		p.offer("akan");
		p.offer("tharun");
		p.offer("share");
		
		System.out.println(p);
		
		p.poll();
		System.out.println(p);
		
		p.add("mark");
		System.out.println(p);
		
		
		
		ArrayDeque<Integer> a=new ArrayDeque<>();
		
		a.add(123);
		a.add(200);
		System.out.println(a);
		
		a.addFirst(600);
		a.addLast(300);
		System.out.println(a);
		
		a.push(555);
		a.push(888);
		System.out.println(a);
		
		
	}

}
