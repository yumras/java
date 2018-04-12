package javastudy;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
//		//변수를 이용한 예
//		int score1, score2, score3;
//		score1=100;
//		score2=33;
//		score3=44;
//		int sum = score1+score2+score3;
//		System.out.println(sum);
//		
//		
//		//배열을 이용한 예
//		int sum1 = 0;
//		int[] scores= {100,33,44};
//		//상동==>int scores[]={100,33,44};
//		for(int i=0;i<3;i++) {
//			sum1+=scores[i];
//			//상동==>sum= sum + scores[i];
//			//i=0 ==> sum+scores[0];
//		}
//		System.out.println(sum1);
//		
//		
//		//배열 new 연산자로 선언
//		String[] name= new String[3];
//		//타입[] 배열명= new 타입[배열크기];
//		name[0]="이름1";
//		name[1]="이이름2";
//		name[2]="이이이름3";
//		//상동===> String [] name = {"이름1","이이름2","이이이름3"};
//		//배열에 값 저장
//		//배열값 출력
//		for(int i1=0;i1<name.length;i1++) {
//			System.out.println(name[i1]);
//		}
//		
//		
//		//키보드로부터 입력받아서 최대값
//		int intArray[];
//		intArray = new int[5];
//		int max=0;  // 현재 가장 큰 수
//		System.out.println("양수 5개를 입력하세요.");
//		//배열에 값 저장하기
//		for(int i2=0;i2<intArray.length;i2++) {
//			intArray[i2] = scanner.nextInt();   //입력받은 정수를 배열에 저장
//			//최대값 비교하기
//			if(intArray[i2]>max) {
//				//현재 배열에 저장된 값과 max변수 비교
//				max = intArray[i2];   // max 변경
//			}
//		}
//		//배열값 처리한 결과값
//		System.out.println("가장 큰 수는 "+max+"입니다.");

		
//		//배열 접근을 for-each문으로 사용한 예
//		
//		String f[]= {"값1", "값2", "값3"};
//		//배열 값에 접근(for-each문)
//		for (String s : f) {   //f[0], f[1],...
//			System.out.print(s+" , ");
//		}
//		//for(int i=0;i<f.length;i++) {
//		// f[i];

		
//		//5개의 정수를 입력받아서 3의 배수만 출력하기.
//		int intArray2 [] = new int[5];
//		System.out.println("양수 5개를 입력하세요.");
//		//배열에 값 저장하기
//		for(int i4=0;i4<intArray2.length;i4++) {
//			intArray2[i4] = scanner.nextInt();   //입력받은 정수를 배열에 저장
//			//최대값 비교하기
//			if(intArray2[i4]%3==0) {
//				System.out.print(intArray2[i4]+" ");
//			}
//		}

		
//		//2차원 배열 ==> 배열안에 또다른 배열
//		//행, 열로 구성
//		//일단 배열을 선언하면
//		//배열변수는 행의 위치를
//		//행은 다시 열의 시작 위치를 가르킴
//		//실제 저장된 곳의 값을 찾아갈 대에는 [행]과 열로 찾아감
//		
//		//2차원 배열 선언
//		int score[][] = new int[2][3]; //2*3의 2차원 배열
//		//2차원 배열에 접근해서 값 저장
//		score[0][0] = 50;  //1*1
//		score[0][1] = 30;  //1*2
//		score[0][2] = 40;  //1*3
//		score[1][0] = 30;  //2*1
//		score[1][1] = 40;  //2*2
//		score[1][2] = 60;  //2*3
//		//상동==> int score[][]={{50,30,40}, {30,40,60}};
//		
//		//배열에 있는 값 출력
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.println(score[i][j]);
//			}
//		} 
//		// i=0, j=0 ==> score[0][0]
//		//      j=1 ==> score[0][1]
//		//      j=2 ==> score[0][2];
//		// i=1, j=0 ==> score[1][0]
//		//      j=1 ==> score[1][1]
//		//      j=2 ==> score[1][2]

		
		//2차원 배열로 합계, 평균 구하기
		int score1[][] = {{3,4}, {4,4}, {4,3}, {2,3}};
		//4*2 2차원 배열
		double sum=0.00;
		double avg=0.0;
		for(int i1=0;i1<score1.length;i1++) {
			//배열명.length : 행 갯수
			for(int j1=0; j1<score1[i1].length;j1++) {
				sum += score1[i1][j1];
			}
		}
		int n=score1.length;
		int m=score1[0].length;
		avg = sum/(n*m);
		System.out.println("합계는 " + sum + ", 평균은 "+avg);
		
	}

}
