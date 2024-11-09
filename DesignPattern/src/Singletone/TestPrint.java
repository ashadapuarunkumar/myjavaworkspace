package Singletone;

public class TestPrint {
	public static void main(String[] args) {
		PrintUtils p1=PrintUtils.getInstance();
		PrintUtils p2=PrintUtils.getInstance();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		
		p1.printjob();
		p2.printjob();
		
		
	}

}
