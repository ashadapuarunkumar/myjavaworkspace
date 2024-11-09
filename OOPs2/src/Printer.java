

@FunctionalInterface
public interface Printer {
//	public static final String VERSION_NO = "v10.23.34" ;
	String VERSION_NO = "v10.32.34";
	
//	public abstract void printjob();
	void printJob();
//	void scanJob();
	
	
	// default will not disturb  any file it will implemets
	default void tshirtPrintJob() {
		System.out.println("T shirt Printed");
		
	}
		
	default void Coffee() {
		System.out.println("coffee will be added");
		
	}
	static void threeDPrint() {
		System.out.println("3D Printing Job Done");
	}
	
}
