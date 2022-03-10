package homework.gl4.a2;


public class Car {
	String brand;
	Engine engine;
	Wheel wheel;

	Car(String brand) {
		this.brand = brand;
		engine = new Engine();
	}

	public String getBrand() {
		return brand;
	}

	public void drive() {
		engine.start();
		System.out.println("Car is run");
	}

	public void changeWheel(Wheel wheel) {
		wheel.change();
	}

	public void fillGas() {
		System.out.println("Car is fill");
	}

	public static void main(String[] args) {
		Car car = new Car("BMW");
		car.drive();
		car.fillGas();
		car.changeWheel(Wheel.LEFT_BACK);
		System.out.println(car.getBrand());

	}

}
