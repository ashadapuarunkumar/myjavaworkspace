
public class Day8p {
	public static void main(String[]args) {
		Day8o battery=new Day8o("Vivo","Li-ION","5000mah","3.70V","4.20V","Good");
		
		Day8 m=new Day8("Vivo",1904,14,"Snapdragon 695","8GB","256GB","Octa Cores",2,12345678912345l,battery);
		
		m.displayMobileDetails();
	}
}
