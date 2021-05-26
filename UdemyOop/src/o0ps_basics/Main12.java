package o0ps_basics;
 class Vehicle{
	 public void ToyVehicle(){
		 System.out.println("hi");
	 }
 }

class Twowheel extends Vehicle{}

class Fourwheel extends Vehicle{}

class Bike extends Twowheel{}

class Car extends Fourwheel{}

public class Main12 {
	
	public static void test(Vehicle v) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new Vehicle());
		test(new Twowheel());
		test(new Fourwheel());
		test(new Bike());
		test(new Car());

   }

}

class Base{
	protected Vehicle getVehicle() {
	
		return null;
	}
}
  
class Derived extends Base {
	//@Override
	public Bike getVehicle(int a) {
		return null;
	}
	
}
























