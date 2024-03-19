package ch_03_04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class 날짜테스트 {
    public static void main(String[] args) {

        Date today = Calendar.getInstance().getTime();
        System.out.println(today);

        // 현재 년도
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(today));

    }
}
