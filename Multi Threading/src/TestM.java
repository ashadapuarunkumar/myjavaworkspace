
class Programming{

}

class JavaThread extends Thread{
	
	@Override
	public void run() {
		for (int i=1;i<=10;i++) {
			System.out.println("Java");
			try {
				Thread.sleep(1000);
				
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}	
	}	
}


//using runnable interface
class PythonThread extends Programming implements Runnable{	
	@Override
	public void run() {
		for(int i=1;i<=10; i++) {
			System.out.println("Python");
			try {
				Thread.sleep(1000);
				
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}	
}

class AngularThread extends Thread{
	public void run() {
		for (int i=1;i<=10;i++) {
			System.out.println("Angular");
			try {
				Thread.sleep(1000);
				
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
			
		}
	}
}






public class TestM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JavaThread j=new JavaThread();
		j.start();
		
		//To begin user defined Thread
	//	j.start();//java.lang.IllegalThreadStateException "ERROR'
		
		//it won't allow user threads . Executed like normal method
	//	j.run();
		
		
		PythonThread p=new PythonThread();
		//p.start(); compilation error
		
		Thread t =new Thread(p);
		t.start();
		t.join();
		
		AngularThread a=new AngularThread();
		
		a.start();
		a.join();
		
		
		//main thraed
		for(int i=1;i<=10;i++) {
			System.out.println("Main");
		}

	}

}
