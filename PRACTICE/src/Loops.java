
public class Loops {

//	public static void printJavaVersions() {
//		int i=65;
//		while(i <= 90) {						//while loop
//			char c =(char)i;
//			System.out.println(c+ " ");
//			i++;
//		}
//		System.out.println();
//		}
	 public static void inf() {
		for(;;) {
			System.out.println("java");
			try {
				 Thread.sleep(20);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	 }
	 public static void main(String[]args) {
		 inf();
	 }
}
//		public static void Table(int num) {					//For loop
//			for(int i=1; i<=20;i++) {
//				System.out.println(num+ " * " +i+ " = " +(num*i));
//			}
//			
//		}
//	
//		public static void main(String[]args) {
//			printJavaVersions();
//			Table(12);
//
//	}
//
//}
