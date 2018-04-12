package javastudy1;

public class Car {
	private String name;
	private int velocity;
	private String color;
	
	public Car() {}
		public Car(String name) {
			this(name, 0);
	}
	public Car(String name, int velocity) {
		this(name, velocity, "검정");
	}
	public Car(String name, int velocity, String color) {
		this.name = name;
		this.velocity = velocity;
		this.color = color;
	}
	public void speedUp() {
		velocity += 1;
	}
	public void speedUp(int speed) {
		velocity += speed;
	}
	public void speedDown() {
		velocity -=1;
	}
	public void speedDown(int speed) {
		velocity -= speed;
	}
	public void stop() {
		velocity =0;
	}
	public String getName() {
		return name;
	}
	public int getVelocity() {
		return velocity;
	}
	public String getColor() {
		return color;
	}
	public String tostring() {
		return "차이름:"+name+" 색깔:"+color+" 속도:"+velocity;
	}
	public static void main(String[] args) {
		Car myCar = new Car("벤츠", 80);
		Car yourCar = new Car("소나타", 70, "빨강");
		myCar.speedUp();
		yourCar.speedUp(10);
		myCar.speedDown(10);
		System.out.println(myCar);
		System.out.println(yourCar);
	}
	
	
	
}
