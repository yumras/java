package javastudy1;

public class Circle {
	public int radius; //필드(=멤버변수)
	public String name; //필드
	//필드 : circle 클래스가 가지는 특징
	//==>이 필드를 이용해서 메소드에서 작업(역할부여)
	
	//메소드  => 역할부여
	//접근자 리턴타임 메소드이름(..) {}
	public double getArea() {
		return 3.14 * radius * radius;
		//3.14 * this.radius * this.radius;
		//3.14 * Circle.radius * Circle.radius;
	}

	//기본생성자 ==> 클래스 이름
	//접근자 클래스이름()...
	
	public Circle() {
	}
	
	//매개변수가 있는 생성자
	public Circle(int r, String n) {
		radius = r; //클래스 필드=전달되는값
		name = n;
	}
	
	
	
	
	public static void main(String[] args) {
	//Circle 크래스에 있는 변수와 메소드를 가져다 쓰려면...
		Circle pizza; //클래스 변수명
		pizza = new Circle(); //객체틀에서 찍어서 사용하기(인스턴스)
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 "+ area);
		
		Circle donut = new Circle(); //인스턴스화
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 "+area);
		
		
		//Circle에 rectangle을 주입해서 사용
		Rectangle rect = new Rectangle(); // 객체 인스턴스화
		rect.width = 40;
		rect.height = 50;
		System.out.println("사각형의 넓이는 " + rect.getArea());

		//매개변수가 있는 생성자를 통해 객체 생성
		Circle test = new Circle(10, "이름");
		area = test.getArea();
		System.out.println(test.name+"의 면적은 "+area);
		
		//Rectangle 클래스에 매개변수 생성자 만들기
		//객체 생성 한개 하기
		
		Rectangle test2 = new Rectangle(80, 216);
		area = test2.getArea();
		System.out.println("사각형의 넓이는 "+ area);
	
		
		
		Book javaBook = new Book("Java", "이르음");
		Book bible = new Book("Bible");
		Book emptyBook = new Book();
		
		javaBook.show();
		bible.show();
		emptyBook.show();
		
		
		
		
		
		
	}

}
