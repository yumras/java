package javastudy;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

//		//1~10까지 합 ===> for을 while문으로
//		int i=1, sum=0;
//		while(i<=10) {
//			sum+=i;
//			i++; //for(int i=0; i<=10; i++)
//		}
//		System.out.println("결과"+sum);
//		
		
		
		int count=0, n=0;
		double sum1=0;
		double avg=0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		while((n=scanner.nextInt()) != 0) { //0이 입력되면 while문 벗어남
			sum1 += + n;
			count++;
		}
		avg=sum1/count;
		System.out.println("수의 개수는 " + count + "개이며 ");
		System.out.println("수의 합은 " + sum1 + "이며 ");
		System.out.println("평균은 "+sum1/count+"입니다.");
	
		
		
	}

}
