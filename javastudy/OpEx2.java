package javastudy;

import java.util.Scanner;

public class OpEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		//입력된 정수가 짝수인지 홀수 인지 출력
		//((변수%2)==0)? "짝수" : "홀수"
		System.out.println("정수를 입력하세요");
				
		int a = scanner.nextInt();
		String b = ((a%2)==0)? "짝수":"홀수";
				
		System.out.println("입력된 정수는 " +b + "다.");
		
		//int a 후 
		//int b = a%2;
		//String c = b==0? "짝수" : "홀수";
		// 이렇게 풀어서도 가능
		
		
	}

}