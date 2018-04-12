package javastudy;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
//
//		System.out.println("나이를 입력하시오: ");
//		int age = scanner1.nextInt();
//		if ((age >= 20) && (age < 30)) { // age가 20~29 사이인지 검사
//			System.out.print("20대 입니다.");
//			System.out.println("20대라서 행복합니다!");
//		} else
//			System.out.println("20대가 아닙니다.");
//
//		// if~elseif(이중 if문, 다중 if문 ===>조건을 여러개...)
//
//		char grade;
//
//		System.out.println("점수를 입력하세요(0~100):");
//
//		int score = scanner1.nextInt(); // 점수 읽기
//		if (score >= 90) // score가 90이상
//			grade = 'A';
//		else if (score >= 80) // score가 80이상 90미만
//			grade = 'B';
//		else if (score >= 70) // score가 70이상 80미만
//			grade = 'C';
//		else if (score >= 60) // score가 60이상 70미만
//			grade = 'D';
//		else // score가 60이상
//			grade = 'F';
//
//		System.out.println("학점은 " + grade + " 입니다.");
//		// System.out.printf("학점은 %c 입니다.", grade);
//
//		
//		
		//중첩 if문 ==> if문 조건 안에 또다른 if문을 쓰는 경우
		
		System.out.println("점수를 입력하세요.");
		int score1 = scanner1.nextInt();
		System.out.println("학년을 입력하세요.");
		int year = scanner1.nextInt();
		
		if(score1>=60) {
			if(year != 4) {
				System.out.println("합격");
			} else if(score1>=70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			} //4학년에 대한 조건
					
		} else { //60점 미만이면
			System.out.println("불합격");
		
		}
		
		
		
		
	}

}
