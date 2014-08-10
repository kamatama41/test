package car;

public class Driver {

	public static void main(String[] args) {
		Car car = new Car();
		car.accelarate();
		car.brake();

		System.out.println("------------");
		Car note = new Car("note");
		note.showName();
		note.accelarate();
		note.accelarate();
		note.showSpeed();
		
		System.out.println("------------");
		Car prius = new Car("prius");
		prius.showName();
		prius.accelarate();
		prius.showSpeed();
		prius.brake();
		prius.showSpeed();
	}
}
