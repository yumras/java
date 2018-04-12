package javastudy;

public class Op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 선언
		
		int remainder = 25 % 2; // 변수타입 변수명 = 값
		System.out.println("25를 2로 나눈 값의 나머지는 " + remainder + "입니다.");
		

		
		
		// 비교연산자
		
		int x = 0, y = 1;
		System.out.println((x < 1)||(y-- < 1));
		System.out.println("x = " + x + ", y = " + y);
		// (x<1)은 true 값을 가지고 ||는 앞이 true면 수행하지 않기 때문에 y값은 변화가 없다.
		x = 0;
		y = 1;
		System.out.println((x < 1)|(y-- < 1));
		System.out.println("x = " + x + ", y = " + y);
		// |는 앞이 true라도 뒤를 수행해야 하기 때문에 y 값은 1 감소한다.
		
		x = 0;
		y = 1;
		boolean z;
		z= ((x<1) || (y--<1));		// 0<1 true   r y<1
		System.out.println("결과는 : " +z);
		z= ((x<1) && (y--<1));		// 
		System.out.println("결과는 : " +z);
		
		
		//대입연산자
		int value = 1;
		value += 1;
		System.out.println("값 = " + value);
		value -= 1;
		System.out.println("값 = " + value);
		value <<= 3;
		System.out.println("값 = " + value);
		value %= 3;
		System.out.println("값 = " + value);
		
		value=1;
		value /=2; // value = value / 2;
		System.out.println("값 = " + value);
		
		
		//부호연산자
		x=1;
		y=1;
		System.out.println("x= " + x + ", x++=" + x++); // x=x+1(문자열과 합친 수에 x값이 증가한다)
		System.out.println("x= " + x + ", --x=" + --x); // x=x-1(문자열과 합쳐지기 전에 x값이 감소된다) 
		System.out.println("y= " + y + ", y++=" + y++); // y=y+1(문자열과 합친 수에 y값이 증가한다)
		System.out.println("y= " + y + ", --y=" + --y); // y=y-1(문자열과 합쳐지기 전에 y값이 감소된다)
		
		
		//조건연산자
		x=3;
		y=(x==1)? 10 : 20; //조건? 참일때 값: 거짓일때 값;
		System.out.println("결과는 : "+y);
		
		
		
	}

}



