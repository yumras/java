package javastudy;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
//		//문자열===> 배열처럼 ㅓ인덱스 번호를 가지면서 저장
//		String a ="hello";
//		String b = new String("java");
//	
//		System.out.println(a.length());
//		System.out.println(a.substring(0, 2));
//		System.out.println(a.charAt(3));
//		String s[] =a.split(",");
//		//문자열을 ,로 구분해서 배열에 저장
//		for(int i=0; i<s.length; i++) {
//			System.out.println(s[i]);
//		}
		
//		//문자열 + 배열을 활용한 영문을 입력하면 한글로 변경
//		String eng[] = {"student", "love", "java", "happy", "future"};
//		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
//		
//		//사용자로부터 입력받아서 사용
//		while(true) {
//			System.out.println("영어 단어를 입력하세요.");
//			String s1=scanner.nextLine();
//			if(s1.equals("exit"))
//				break; //s1이 exit라면 중단
//			
//			int i1;
//			for(i1=0; i1<eng.length; i1++) {
//			//배열 길이만큼 반복
//				if(eng[i1].equals(s1)) {
//				//배열에 저장된 값과 내가 입력한 값이 같으면
//					System.out.println(kor[i1]);
//					break;
//				}
//			}
//			if(i1==eng.length)
//				System.out.println("그런 영어 단어가 없습니다");
//		}
		
		
		
		char ch = ' ';
		System.out.println("문자를 하나 입력하세요.");
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('a' <= ch && ch <= 'z') {
			ch=(char) (ch-32);
			System.out.println(input.toUpperCase());
		}else if('A' <= ch && ch <= 'Z') {
			ch=(char) (ch+32);
			System.out.println(input.toLowerCase());
		}	
		System.out.println(ch);
		System.out.println(input.toUpperCase());
		
		//toLowerCase() : 소문자로
		
	}

}
