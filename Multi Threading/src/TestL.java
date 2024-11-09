
class YellowThread extends Thread {

	public void run() {
		for (int i = 1; i <= 6; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();

			}
			System.out.println("YELLOW");
		}
	}
}

class RedThread extends Thread {

	public void run() {
		for (int i = 1; i <= 6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();

			}
			System.out.println("RED");
		}
	}
}

class GreenThread extends Thread {

	public void run() {
		for (int i = 1; i <= 6; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("GREEN");
		}
	}
}

public class TestL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		while (true) {

			YellowThread y = new YellowThread();
			y.start();
			y.join();

			RedThread r = new RedThread();
			r.start();
			r.join();

			GreenThread g = new GreenThread();
			g.start();
			g.join();

		}
	}

}
