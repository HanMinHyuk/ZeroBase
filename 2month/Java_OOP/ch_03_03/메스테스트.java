package ch_03_03;

public class 메스테스트 {

    public static void main(String[] args) {

        double d1 = 12.426;
        // 소수점 2째자리까지 표현
        // 하기 위해서, 올림, 반올림, 버림을 해라
        // 올림 : 12.43
        // 반올림 : 12.43
        // 버림 : 12.42

        double x1 = 0;
        double y1 = 0;
        double x2 = 3;
        double y2 = 4;

        System.out.println(SmartMath.distance(x1, y1, x2, y2));

        System.out.println(Math.pow(10, 2));

        System.out.println(d1);
        System.out.println(Math.round(d1)); // 12
        System.out.println(Math.ceil(d1)); // 13.0
        System.out.println(Math.floor(d1)); // 12.0

        System.out.println("-------------");
        System.out.println(SmartMath.round(d1, 2)); // 12.43
        System.out.println(SmartMath.ceil(d1, 2));  // 12.43
        System.out.println(SmartMath.floor(d1, 2)); // 12.42



    }

}
