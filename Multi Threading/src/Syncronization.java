

class MyMath{
	
	//Only one  thread is allowed to access
	public synchronized void printMulTable(int num) {
		for(int i=0;i<=10;i++) {
			System.out.println(num+ " x " +i+ " = " +num*i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static synchronized void printSquare(int num) {
		for (int i=1;i<=num;i++) {
			System.out.println(i*i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		
		}
	}
}
}
class NTR extends Thread{
	MyMath m;
	
	public NTR (MyMath m) {
		this.m=m;
	}
	
	public void run() {
		m.printMulTable(10);
	}
	
}
class Ram extends Thread{
	MyMath m;
	
	public Ram(MyMath m) {
		this.m=m;
	}
	
	public void run() {
		m.printMulTable(11);
	}
	
}
class AA extends Thread{
	MyMath m;
	
	public AA(MyMath m) {
		this.m=m;
	}
	
	public void run() {
		m.printMulTable(12);
	}
	
}
class Amar extends Thread{
	MyMath m;
	
	public Amar(MyMath m) {
		this.m=m;
	}
	
	public void run() {
		m.printMulTable(13);
	}
	
}

public void run() {
	
}
class arjun extends Thread{
MyMath m;
	
	public arjun(MyMath m) {
		this.m=m;
	}
	
	public void run() {
		MyMath.printSquare(13);
	}
	
}

public class Syncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMath m=new MyMath();

		
		NTR n=new NTR(m);
		Ram r= new Ram(m);
		Amar b=new Amar(m);
		AA a=new AA(m);
		arjun j=new arjun(m);
		
		n.start();
		a.start();
		r.start();
		b.start();
		j.start();
		

	}

}
