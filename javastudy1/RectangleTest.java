package javastudy1;

import java.util.Scanner;

class Rect {
	private double width, length;   //필드 2개(멤버 변수)
	//기본생성자
	public Rect() {
		this.width=10.0;
		this.length=10.0;
		//동일 = this(10.0, 10.0);
	}
	
	//매개변수 2개 생성자
	public Rect(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	//setter/getter 메소드 정리

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	//계산 메소드
	public double calcArea() {
		return width*length;
	}
	//toString() : 객체의 처리한 결과를 문자열로 리턴
	//상위객체(object)에서 제공하는 메소드
	public String toString() {
		return "가로 " + width +
		", 세로 " + length + ", 넓이는 " + calcArea();
		//출력 문장
	}
}


public class RectangleTest {
	public static void main(String[] args) {
		Rect r1 = new Rect(); //기본생성자
		System.out.println("가로="+r1.getWidth() +
				", 세로="+r1.getLength() + ", 넓이="+r1.calcArea());
		Rect r2 = new Rect(5.5, 10.0);	//매개변수 생성자
		System.out.println(r2);			//객체 정보출력 ===> toString()
		r2.setWidth(20.0);
		System.out.println(r2.toString());
		Scanner scanner = new Scanner(System.in);
		Rect r3 = new Rect();
		System.out.println("가로값, 세로값을 입력하세요.");
		r3.setWidth(scanner.nextDouble());
		r3.setLength(scanner.nextDouble());
		System.out.println(r3.toString());
	}
	
}

// 객체간의 상호작용(메시지 전달방법)
// 1> 객체, 메소드()
// 2> 생성자를 통해 전달
// 3> getter/setter() 통해서도 전달
// ==>getter : 객체에 저장된 필드 변수값을 알고 싶을때
// ==>setter : 객체에 필드 변수값을 새롭게 설정할때
// ex)객체명, 필드변수 = 값; //setter 의미
//    변수 = 객체명, 필드변수; // getter 의미

