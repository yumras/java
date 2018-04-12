package javastudy1;

public class Rectangle {
		int width;  //필드 ==> 생략하면 default
		int height;
		int getArea() {
			return width*height;
		}
		
		public Rectangle() {
		}
		
		//매개변수가 있는 생성자
		public Rectangle(int w, int h) {
			width = w; //클래스 필드=전달되는값
			height = h;
		}
}

