import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		  //Normal arraylist
		ArrayList   al= new ArrayList();
	System.out.println(al.size());
		
		//No type safety and avoid type casting
		al.add(100);
		al.add(1,3); 
		al.add(0,200);
		
		
		System.out.println(al);
		System.out.println(al.size());
		al.remove(2);
		System.out.println(al);
		System.out.println(al.size());
		
		al.add("Sar");
		System.out.println(al);
		al.add(3,"mad");
		System.out.println(al);
		
		al.add(1,20);
		System.out.println(al);
		
		System.out.println(al.get(2));
		al.clear();
		System.out.println(al);
		System.out.println(al.size());
		al.addAll(al);
		System.out.println(al);
		
		
		
		ArrayList <String>  all= new ArrayList<String>();
		System.out.println(all.size());
		
		
		
		
		
		
	}
}
