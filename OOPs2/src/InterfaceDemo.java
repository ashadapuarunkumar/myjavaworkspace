
public class InterfaceDemo {

	public static void main(String[] args) {
		//Object creation or Intialization is not allowed
	//	Printer p=new EpsonPrinter();
		
		//reference type	Value type
		EpsonPrinter e=new EpsonPrinter();
		e.printJob();
		//e.scanJob();
		e.tshirtPrintJob();
		e.Coffee();
		
		
		
		CanonOPrinter cp=new CanonOPrinter();
		cp.printJob();
	//	cp.scanJob();
		cp.tshirtPrintJob();
		cp.Coffee();
		
		
		HpPrinter hp=new HpPrinter();
		hp.printJob();
	// 	hp.scanJob();
		hp.tshirtPrintJob();
		hp.Coffee();
		
		//static methods
		
		Printer.threeDPrint();
	}

}
