package ch_03_01;
import java.util.Date;
import java.util.Calendar;


public class Sample {
    public static void main(String[] args) {

        String str = "홍길동";
        System.out.println(str);

        Date today = Calendar.getInstance().getTime();
        System.out.println(today);
    }
}
