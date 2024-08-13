package keerthi;
class Myclass{
	void noofwheel() {
		System.out.println("they have two wheels");
	}
}
class vehicles extends Myclass{
	void noofwheels() {
	System.out.println("i have two brakes");
	}
}
class Bike extends vehicles{
	void brandname() {
		System.out.println("they have two tvs");
		
	}

	}

public class Twowheeler {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.noofwheel();
		bike.brandname();
		bike.noofwheels();
	}

}
