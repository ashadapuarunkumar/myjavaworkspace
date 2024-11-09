package Interestpolicy;

public class Calciii {
	public static int findSum(int num) {
		return num+num;
	}
	public static int findmine(int num) {
		return num-num;
	}
	public static double findIntrest(double p, double r, int t) {
			
			double interest = 0;
			
			interest = (p * t *r)/100;
			
			return interest;
		}
	}


