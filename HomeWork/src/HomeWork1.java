public class HomeWork1 {
	public static int reverse(int num) {
		int rev=0;
		while (num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		return rev;
	}
	public static int sum(int num) {
	   int sum=0;
	   while (num!=0) {
		   int rem= num%10;
		   sum=sum+rem;
		   num=num/10;
	   }
	   return sum;
	}
	public static int count(int num) {
		int count=0;
		while (num!=0) {
			   int rem= num%10;
			   count++;
			   num=num/10;
		   }
		return count;
	}

}