package ch_03_01;

import java.util.Calendar;
import java.util.Date;

public class Sample4 {
    public static void main(String[] args) {

        Object obj1 = new Object();

        System.out.println(obj1.toString()); // @ 다음은 hashCode의 16진수
        System.out.println(obj1.hashCode());
        System.out.println(Integer.toHexString(obj1.hashCode()));

        String str1 = new String("홍길동");
        System.out.println(str1.toString());

        Date dt1 = Calendar.getInstance().getTime();
        System.out.println(dt1.toString());

        사람 홍길동 = new 사람("홍길동", 20);
        System.out.println(홍길동.toString());


    }
}
