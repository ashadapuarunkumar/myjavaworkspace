
public class Day9o {
	public static void main(String[]args) throws  CloneNotSupportedException {
		
		Day9 c1=new Day9(1022,"Aurora","Madhavi",80000);
		Day9 c2=new Day9(1023,"Aurora","Suman",90000);
		Day9 c3=new Day9(1034,"Avanthi","Ajay kumar",80000);
		
		//shallow cloning
		Day9 c4=c1;
		System.out.println("c1: "+c4.hashCode());
		System.out.println("c4: "+c1.hashCode());
		
		Day9 c5=(Day9) c2.Clone();
		System.out.println("c5: "+c2.hashCode());
        System.out.println("c2: "+c5.hashCode());
        
		//String 		
        
//		System.out.println(c1,toString());
//		System.out.println(c2,toString());
//		System.out.println(c3,toString());
//		System.out.println(c4,toString());
//		
		//Hash code
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		
		//Reference comparison
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c3==c4);
		System.out.println(c1==c4);
		System.out.println(c1==c3);
		
		
		//reference comparison
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c3.equals(c4));
		System.out.println(c1.equals(c4));
		System.out.println(c1.equals(c3));
		
		
		String s1=new String("Java");
		String s2=new String("Java");
		System.out.println(s1.equals(s2));
		
		
	}
	
	
}
