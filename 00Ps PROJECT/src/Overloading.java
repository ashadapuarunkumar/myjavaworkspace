
class MyCalc{
	public static int findMax(int a,int b) {
		return (a>b) ? a: b ;
	}
	public static long findMax(long a,long b) {
		return (a>b) ? a: b ;
    }
	public static double findMax(double a,double b) {
		return (a>b) ? a: b ;
	}
	
	//Variable length argment method or var atg method
//	public static void sum(int...a) {
//		System.out.println("Java");
//		
//	}
	public static void sum(int...a) {
		int total=0;
		for(int x : a) {
			total+=x;
		}
		System.out.println(total);
	}

}
public class Overloading {
	public static void main(String... args) {
		MyCalc.sum();
		MyCalc.sum(1);
		MyCalc.sum(1,3);
		MyCalc.sum(1,3,4);
		MyCalc.sum(2,3,4,4);
		MyCalc.sum(4,3,2,1,4);
		
		
//		MyCalc.sum(new int[] (1,2,3,4,5,6,7,8,9));
			
		int maxInt=MyCalc.findMax(500000000, 100);
		System.out.println(maxInt);
		
		long maxLong =MyCalc.findMax(9999999L , 11111111111L);
		System.out.println(maxLong);
		
		double maxdouble =MyCalc.findMax(45000.00, 5600.00);
		System.out.println(maxdouble);
		
		
		
		
	}
	
}
