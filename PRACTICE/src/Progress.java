import java.util.Scanner;

public class Progress {
	public static void main(String[] args) {
		Progress2 pro=new Progress2();
		Scanner n =new Scanner(System.in);
		double arr[]=new double[6];
		for( int i=0; i<arr.length;i++) {
			System.out.println("enter the subject:"+(i+1)+ " marks");
			arr[i]=n.nextDouble();
			while(arr[i]>100) {
				System.out.println("please enter marks for subject: "+(i+1));
				arr[i]=n.nextDouble();
			}
		}
		System.out.println("Enter a Student Name");
		n.nextLine();
		String name=n.nextLine();
		System.out.println("Enter a Student R.no");
		int rno=n.nextInt();
		n.close();
		System.out.println("------------------------------------------");
		System.out.println("Student name: "+name);
		System.out.println("Student Roll no: "+rno);

		for(int j=0; j<arr.length;j++) {
			System.out.println("subject "+(j+1)+" :  "+arr[j]);
		}
        System.out.println("Total marks = "+pro.sum(arr));
        System.out.println("Avarage marks = "+pro.avg(arr));
        System.out.println("percentage = "+pro.percentage(arr));
        System.out.println("maximum marks = "+pro.max(arr));
        System.out.println("minimum marks = "+pro.min(arr));
        pro.finalresult(arr);
	}
}