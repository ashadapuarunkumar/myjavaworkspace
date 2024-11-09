
public class Billprocess {
	public void displayFinalBill(int totalBillAmount) {
		DiscountCalc calc=new DiscountCalc();
		double discount=calc.findDiscount(totalBillAmount);
		
		System.out.println("Bill Amount: "+totalBillAmount);
		System.out.println("Discount: "+discount);
		System.out.println("Final bill amount: " +(totalBillAmount-discount));
	
	}

}
