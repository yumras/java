package javastudy;


public class VarEx {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int mach;  // --> 4byte
        int distance;
        mach = 340; //int mach = 340;
        distance = mach * 60 * 60;
        System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");

        double radius;
        double area;
        final double PI=3.141592;
        radius = 10.0;
        area = radius * radius * PI;
        System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);

        radius = 100.0;
        area = radius * radius * PI;
        System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);


        //문자 및 논리 타입 응용

        char ga1 = '가';
        char ga2 = '\uac00';    // '\uac00' = '가'에 해당하는 유니코드 값이다.
        String str = "hello";
        boolean cham = true;
        boolean geojit = false;

        System.out.println(ga1);
        System.out.println(ga2);
        System.out.println(str);
        System.out.println(cham + "가 아니면 " + geojit + "입다.");

        int i;
        double d;
        double d1;

        i = 7 / 4;      
        // int는 7 / 4 값인 1.75에서 중 1의 자리만(정수) 추출해서 1이 된다.
        System.out.println(i);
        
        d = 7 / (double) 4; 
        // (double)이 붙어 4가 정수가 되면 식 7 / 4.0 이 되어서(실수) 1.75가 된다
        d1 = 7 / 4.0; 
        // 4.0(정수)로 나누면 1.75가 된다.
        System.out.println("double값은 : " + d + " & " + d1); //
        
        double d2 = 1.999999;
        int j = (int) d2;
        System.out.println(j);
        // (int)를 붙여 d2값을 int로 변환하면 소수점이 삭제된다.
        byte b = (byte) 300;
        System.out.println(b);
        // byte는 2의8승(256)이어서 300-256 후 남은 값인 44가 출력된다.


    }

}
