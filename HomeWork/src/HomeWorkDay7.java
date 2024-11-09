import java.util.Scanner;

public class HomeWorkDay7 {
	public static void main(String[] args) {
		Day7HomeWork process=new Day7HomeWork();
		Scanner sc =new Scanner(System.in);
		double arr[]=new double[6];
		for( int i=0; i<arr.length;i++) {
			System.out.print("enter the subject:"+(i+1)+ " marks");
			arr[i]=sc.nextDouble();
			while(arr[i]>100) {
				System.out.println("please enter vaid marks for subject: "+(i+1));
				arr[i]=sc.nextDouble();
			}
		}
		System.out.println("Enter a Student Name");
		sc.nextLine();
		String nm=sc.nextLine();
		sc.close();
		System.out.println("------------------------------------------");
		System.out.println("Student name: "+nm);
		for(int j=0; j<arr.length;j++) {
			System.out.println("subject :"+(j+1)+" ="+arr[j]);
		}
        System.out.println("Total marks = "+process.total(arr));
        System.out.println("Avarage marks = "+process.avg(arr));
        System.out.println("percentage = "+process.percentage(arr));
        System.out.println("maximum marks = "+process.max(arr));
        System.out.println("minimum marks = "+process.min(arr));
        process.finalresult(arr);
	}
}