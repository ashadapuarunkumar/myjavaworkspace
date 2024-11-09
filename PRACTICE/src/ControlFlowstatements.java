
public class ControlFlowstatements {
	public static boolean isEven(int num) {
		boolean status=false;
		
		if(num%2==0)  {
	        status=true;
		}
		return status;
	
	}
	public static void findEvenOrOdd(int num) {
		if(isEven(num)) {
			System.out.println(num+" is even ");
		} else {
			System.out.println(num+" is odd ");
		}
	}
	
	public static void main(String[] args) {
		findEvenOrOdd(10);
		findEvenOrOdd(19);
       boolean tyu=  isEven(12);
       System.out.println(tyu);
	}

}
