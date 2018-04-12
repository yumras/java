package javastudy;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	
		//화면에 1~5까지 숫자 찍어주는 예제
//	
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		
	
		//위에 출력되는 내용을 for문으로 변경
//		int i, sum = 0;
////		for(i=1;i<=5;i++) {    //1~5 반복
////			System.out.println(i);; //더하는 수 출력
////		}
////		
//		
//		for(i=1;i<=10;i++) {    //1~10 반복
//			sum += i;
//			System.out.print(i);; //더하는 수 출력
//			
//			if(i<=9) // 1~9까지는 '+' 출력
//				System.out.print("+");
//			else { //i가 10인 경우
//				System.out.print("=");
//				System.out.println(sum);
//			}
//		}
//		
//		int i1 = 0;
//		sum = 0;
//		for(i1=1;i1<=10000; i1++) {
//			sum += i1; //sum=sum+i1;
//			//i1=1 ==> 조건(true) ==> sum =0+1 ==> sum=1
//			//i1=2 ==> 조건(true) ==> sum =1+2 ==> sum=3\
//		}
//		System.out.println("1-10까지의 합 "+sum);
		
	
//				
//		
//		for(int i2=2;i2<=9;i2++) {
//			System.out.println(i2+"단입니다.");
//			for(int i3=1;i3<=9;i3++) {
//			 System.out.println(i2+" * "+i3+" = "+(i2*i3));
//			}
//		}
//		


//	
//	
//		//사용자로부터 입력받은 값을 반복
//		int dan =0;
//		System.out.print("단을 입력하세요>>");
//		dan = scanner.nextInt();
//		for (int i2=1; i2<=9;i2++) {
//			System.out.println(dan+" * "+i2+" = "+(dan*i2));
//		}
//		
//		
//		
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i+"*"+j+"="+(i*j));
				System.out.print('\t'); //하나씩 탭으로 띄기
			}
			System.out.println(); //한 단이 끝나면 다음 줄로 커서 이동
		}
//	
//		
		
	
	
	
	
	
	
	}
}
	
