package car;

public class Car {

	private String name;
	private int speed;
	
	public Car() {
		System.out.println("コンストラクタが呼ばれました");
	}

	public Car(String name) {
		this.name = name;
	}

	public void showName() {
		System.out.println("この車の名前は" + name + "です。");
	}

	public void showSpeed() {
		System.out.println("現在の速度は時速" + speed + "kmです。");
	}
	
	public void accelarate() {
		speed += 20;
		System.out.println("加速しました。");
	}

	public void brake() {
		speed -= 20;
		System.out.println("減速しました。");
	}
}
