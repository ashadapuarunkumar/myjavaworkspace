
public class Day8o {
	
	String btCompanyName,btType,btCapacity,btVolts,chargeLimit,OpTemp;

	public Day8o(String btCompanyName, String btType, String btCapacity, String btVolts, String chargeLimit,
			String opTemp) {
		super();
		this.btCompanyName = btCompanyName;
		this.btType = btType;
		this.btCapacity = btCapacity;
		this.btVolts = btVolts;
		this.chargeLimit = chargeLimit;
		OpTemp = opTemp;
	}
	class sim{
		
	}
	
	
	public void displayBatteryDetails() {
		System.out.println("  BATTERY FEATURES  ");
		System.out.println("------------------- ");
		System.out.println("Bttery Company Name:  "+btCompanyName);
		System.out.println("Battery Type: "+btType);
		System.out.println("Battery Capacity: "+btCapacity);
		System.out.println("Battery Voltage: "+btVolts);
		System.out.println("Battery Charge Limit: "+chargeLimit);
		System.out.println("Battery Operating Temperature: "+OpTemp);
//		String bt  Raj;
//		System.out.println("RAM: "+btRaj);
	}
	
	
}
