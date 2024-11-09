
public class MethodsDemo {
	
	//static method - Utlity purpose

	public static void findSquare(int num) {
		int square = num * num ;
		System.out.println(square);		

	}
		//instance method object level
	public static void findCube(int num) {
			int cube = num * num * num ;
			System.out.println(cube);	
	}
	public static int findMin(int num1,int num2) {
		int min = (num1 >num2) ? num1 :num2;
		return min;
	}
	public static double findTotal(double num1,double num2) {
		return num1+num2;
	}
	public static double findAvg(double num1, double num2) {
		double total = findTotal(num1,num2);
		double avg = total/2;
		return avg;
	}
	
	public static void main(String[] args) {
		
		double avg = findAvg(55,100);
		System.out.println(avg);
		
		

		int min = findMin(200,300);
		System.out.println(min);
	
		findSquare(10);
		
		//accessing Instance methods
		MethodsDemo m=new MethodsDemo();
		m.findCube(10);
		
		
		//Accessing Static Methods
		findSquare(5);  			//directly within sample class
		m.findSquare(10);			//Rreference variable not Reccommened
		MethodsDemo.findSquare(20);  //Using class name
		
	}

}
