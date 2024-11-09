package pck1;

//default scope
 public class Calc {
	 
	//accessible from within package and outsidepackage also
public	 static final double PI_VALUE=3.14;
	 
	
	public  static final int MAX_VALUE=10;
	
	//Accessible only within class
	private int length =5;
	
	
	 //accessible from within package only
	// static final double PI_VALUE=3.14;
	
	//accessible from within package only
		int findSquare(int num) {
			return num*num;
		}
		public int findCube(int num) {
			return num*num*num;
		}
		
		private int findTotal(int a, int b) {
			return a+b;
		}
//		protected  int doubleIt (int num) {
//			return a;
//		}
		
		
}
