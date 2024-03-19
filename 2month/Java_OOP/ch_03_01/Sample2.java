package ch_03_01;

public class Sample2 {

    public static boolean isHongildong(String str) {

        if ("홍길동".equals(str)) {

        }

        if (str != null && str.equals("홍길동")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String str1 = "홍길동";
        String str2 = "이순신";
        String str3 = null;

        /*
        // 기본형 사용 시
        if (str1 == str2) {
        }

        // 참조형 사용 시
        if (str1.equals(str2)) {

        }

        if (str2.equals(str1)) {

        }
        */

        System.out.println(isHongildong(str1));
        System.out.println(isHongildong(str2));
        System.out.println(isHongildong(str3));
    }
}
