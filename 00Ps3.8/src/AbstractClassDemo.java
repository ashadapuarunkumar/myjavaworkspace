
interface Vehicle{
	void wheels();
	void start();
	void stop();
	void move();
}

abstract class MyVehicle implements Vehicle{
	public void start() {
		System.out.println("Start...");
	}
	public void move() {
		System.out.println("Move...");
	}
	public void stop() {
		System.out.println("Stop....");
	}
	public abstract void wheels() ;
		
}

class Bike extends MyVehicle{

	@Override
	public void wheels() {
		
		System.out.println("2 Wheels");
		// TODO Auto-generated method stub
		
	}
	
}

class Car extends MyVehicle{

	@Override
	public void wheels() {
		System.out.println("4 Wheels...");
		
	}
	
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		Bike b=new Bike();
		b.wheels();
		b.start();
		b.move();
		b.stop();
		
		
		System.out.println("=====================");
		
		Car c=new Car();
		c.wheels();
		c.start();
		c.move();
		c.stop();
		
	}

}
