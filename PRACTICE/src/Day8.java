public class Day8 {
	String mobileName ;
	int modelNumber,androidVersion;
	String Processor,Ram,Rom,Cores;
	int simSlots;
	long IMEI;
	Day8o battery; 
public Day8(String mobileName, int modelNumber, int androidVersion, String processor, String ram, String rom,
			String cores, int simSlots, long iMEI, Day8o battery) {
		super();
		this.mobileName = mobileName;
		this.modelNumber = modelNumber;
		this.androidVersion = androidVersion;
		Processor = processor;
		Ram = ram;
		Rom = rom;
		Cores = cores;
		this.simSlots = simSlots;
		IMEI = iMEI;
		this.battery = battery;
	}
	public void displayMobileDetails() {
		System.out.println("MOBILE FEATURES ");
		System.out.println("----------------- ");
		System.out.println("Mobile Name: "+mobileName);
		System.out.println("Mobile Model: "+modelNumber);
		System.out.println("Mobile Android Version: "+androidVersion);
		System.out.println("Mobile Processor: "+Processor);
		System.out.println("Mobile RAM: "+Ram);
		System.out.println("Mobile ROM: "+Rom);
		System.out.println("Mobile Cores: "+Cores);
		System.out.println("Mobile Sim Slots: "+simSlots);
		System.out.println("Mobile IMEI Number: "+IMEI);
		System.out.println("----------------");
		battery.displayBatteryDetails();
		
	}
}
