package javastudy1;

import java.util.Scanner;

public class Phone1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 전화번호를 입력하세요.");
		String name1 = scanner.next();
		String tel1 = scanner.next();
		Phone a = new Phone(name1, tel1);
		
		System.out.println("이름과 전화번호를 입력하세요.");
		name1 = scanner.next();
		tel1 = scanner.next();
		Phone b = new Phone(name1, tel1);
		
		System.out.println(a.getName()+"의 번호 "+a.getTel());
		System.out.println(b.getName()+"의 번호 "+b.getTel());

	}

}
