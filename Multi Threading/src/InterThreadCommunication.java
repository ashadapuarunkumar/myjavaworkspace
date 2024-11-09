
class DavidThread extends Thread {
	int total = 0;

	@Override
	public void run() {
		System.out.println("2.David dude");
		for (int i = 1; i <= 100; i++) {
			total += i; 
		}
		System.out.println("3.David call lifting.......");
		synchronized (this) {
		//	this.notify();
		   this.notifyAll();
		}
		// connecting Network or Database
	}

}

public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		DavidThread d = new DavidThread();
		d.start();

		// main Thread
	//	 Thread.sleep(100);
		// d.join();
		System.out.println("1.David call called .....");
		synchronized (d) {
			d.wait(100);
		}
		System.out.println("4.Call Ended by David....");
		System.out.println(d.total);
	}

}
