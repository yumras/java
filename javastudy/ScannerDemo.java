package javastudy;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        //객체 생성
        //클래스 변수 = new 클래스 ();
        System.out.printf("숫자를 2개 입력하세요.\n");
        //println=줄바꿈이 포함됨
        //printf=줄바꿈 포함 x, float포함 -> 줄바꿀때 마지막에 \n추가

        Scanner in = new Scanner(System.in);
        int x = in.nextInt(); //객체사용법 : 객체변수명.메소드();
        int y = in.nextInt();

        System.out.printf("%d * %d은 %d이고 %d + %d은 %d입니다.\n", x, y, x * y, x, y, x + y);
        // %d가 여러개면 각 해당하는 값을 뒤에 ,로 구분해서 설정해야한다.




        System.out.printf("이름과 나이를 입력하세요.\n");
        String name = in.next();
        int age = in.nextInt();


        System.out.printf("당신의 이름은 " + name + ", 나이는 " + age + "입니다.\n");



        //문제 : 직사각형의 가로
        //세로 값을 입력받아서 넓이를 구하는 실습

        System.out.printf("직사각형의 가로 값과 세로 값을 입력하세요.\n");

        x = in.nextInt();   //앞에 int x로 x를 선언했기 때문에 x만 입력해서 변경
        y = in.nextInt();

        System.out.printf("직사각형의 넓이는 %d입니다.\n", x * y);


    }
}
