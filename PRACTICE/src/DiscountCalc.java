
public class DiscountCalc {
	
	

	public double findDiscount(int totalBillAmount) {
		double discount=0.0;
		
		if(totalBillAmount < 100) {
			discount = totalBillAmount* .05;
			
		} else if(totalBillAmount >250) {
			discount = totalBillAmount* .01;
			
		} else if(totalBillAmount >500) {
			discount = totalBillAmount* .15;
			
		} else if(totalBillAmount >750) {
			discount = totalBillAmount* .2;
			
		} else if(totalBillAmount >1000) {
			discount = totalBillAmount* .25;
			
		}else {
			discount = totalBillAmount* .3;
		}
	     
			return discount;
	}
	public void displayFinalBIll(int totalBillAmout) {
		System.out.println("Bill Amount: "+totalBillAmout);
		System.out.println("Discount: "+findDiscount(totalBillAmout));
		System.out.println("Final bill amount: ");
	}
	
	public static void main(String[]args) {
		
		DiscountCalc d = new DiscountCalc();
		double discount = d.findDiscount(600);
		System.out.println(discount);
		
	}

}
