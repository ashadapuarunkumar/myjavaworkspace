import java.util.Arrays;
public class Day7HomeWork{
	public  static double total(double arr[]) {
		double total=0.0;
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
		}
		return total;
	}
	public static double avg(double arr[]) {
		double avg=0.0;
		avg=total(arr)/6;
		return avg;
	}
	public static double percentage(double arr[]) {
		double percentage=0.0;
		percentage=total(arr)/6;
		return percentage;
	}
	public static double max(double arr[]) {
		double max;
		max = Arrays.stream(arr).max().getAsDouble(); 
		return max;
	}
	public static double min(double arr[]) {
		double min;
		min = Arrays.stream(arr).min().getAsDouble(); 
		return min;
	}
	public static void finalresult(double arr[]) {
		String result="null";
		if(min(arr)<35) {
			  result="fail";
		}
		else if(percentage(arr)>90){
			 result="A+";
		}
		else if(percentage(arr)>80){
			 result="A";
		}
		else if(percentage(arr)>70){
			 result="B+";
		}
		else if(percentage(arr)>60){
		     result="B";
		}
		else if(percentage(arr)>50){
			result="C+";
		}
		else if(percentage(arr)>=40){
			result="C";
		}
		else if(percentage(arr)<40){
			result="fail";
		}
		if(result=="fail") {
			System.out.println("Total Grade = --");
			System.out.println("Final Result = "+result);
		}
		else {
			System.out.println("Total Grade = "+result);
			System.out.println("Final Result = pass");
		}
	} 
}