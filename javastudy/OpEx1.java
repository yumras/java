package javastudy;

import java.util.Scanner;

public class OpEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		//문제 : 초 단위로 정수를 입력받아 시, 분, 초 구하기
		
		
		Scanner scanner = new Scanner(System.in);
		//키보드로 입력받기 위한 객체 생성   ===> 1단계
		System.out.println("정수를 입력하세요.");
		int time = scanner.nextInt();
		//2단계 ; 키보드로 입력한 값을 읽어옴
		//nextInt(); // 정수로 저장
		
		int hour = time/3600; //시 정수/3600 ===>시간
		int minute = time%3600/60; //분 %=나누고 난 후 나머지 값 
		int second = time%60; // 초
		
		System.out.println(time+"초는" + hour +"시"+ minute+"분"+second+"초");
		
		
		
	}

}
