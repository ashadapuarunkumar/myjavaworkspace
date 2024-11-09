package Singletone;

public class PrintUtils {
	private static PrintUtils instance;
	
	private PrintUtils() {}
	
		public static PrintUtils getInstance() {
			if (instance==null) {
				instance=new PrintUtils();
			}
			return instance;
		}
		public void printjob() {
			System.out.println("Print........");
		}
	     

}
