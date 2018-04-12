package javastudy;

public class PrintFormat {

    public static void main(String[] args) {
        //변수 + 정수, 실수 리터럴 사용법


        int i = 97;
        String s = "Java";
        double f = 3.14f;
        System.out.printf("정수출력 : %d\n", i);
        System.out.printf("정수출력 : [%10d]\n", i);
        System.out.printf("정수출력 : %o\n", i);
        System.out.printf("정수출력 : %x\n", i);
        System.out.printf("정수출력 : %c\n", i);
        System.out.printf("정수출력 : %5d\n", i);
        System.out.printf("정수출력 : %-5d\n", i);
        System.out.printf("정수출력 : %05d\n", i);
        System.out.printf("문자출력 : %s\n", s);
        System.out.printf("문자출력 : %5s\n", s);
        System.out.printf("문자출력 : %-5s\n", s);
        System.out.printf("실수출력 : %f\n", f);
        System.out.printf("실수출력 : %e\n", f);
        System.out.printf("실수출력 : %5.1f\n", f);
        System.out.printf("실수출력 : %05.1f\n", f);
        System.out.printf("실수출력 : %-5.1f\n", f);


        }

    }
