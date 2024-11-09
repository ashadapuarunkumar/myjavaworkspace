import java.util.*;
public class Day5 {
	public static void reverse(int num) {
		System.out.println("reverse of a number");
		if (num>0) {
		while(num!=0) {
			int N =num%10;
			System.out.print(N);
			num=num/10;
		}
		System.out.println("");
	}	else {
			System.out.println("please enter possitive number !!!!!!");
		}
	}
	public static void sumOfDigits(int num) {
		System.out.println("sum of digits of a number");
		int m=0;
		while(num!=0) {
			int N =num%10;
			num=num/10;
			m=m+N;
		}
		System.out.println(m);
	}
	public static void countOfDigits(int num) {
		System.out.println("count of digits of a number");
		int i=0;
		while(num!=0) {
			num=num/10;
			i++;
		}
		System.out.println(i);
	}
	public static void main(String[] args) {
		Scanner c =new Scanner(System.in);
		System.out.println("enter a number");
		int num= c.nextInt();
		reverse(num);
		sumOfDigits(num);
		countOfDigits(num);
	}
  
}