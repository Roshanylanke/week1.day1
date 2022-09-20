package week1.day1;

public class Car {

	
		public void driveCar() {
			System.out.println("car driving successful");
		}
		public void applyBrake() {
			System.out.println("Brake applied successfully");
		}
		public void soundHorn() {
			System.out.println("Horn working successfully");
		}
		public void isPuncture() {
			System.out.println("Car is punctured");
		}
		public static void main(String[] args) {
			Car obj = new Car();
			obj.driveCar();
			obj.applyBrake();
			obj.soundHorn();
			obj.isPuncture();

		
	}
	

}
