package ch_03_01;

public class 문자열테스트2 {

    public static void p(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {

        String str1 = "홍길동";
        String str2 = "이순신";

        // compareTo()
        // 앞에 있으면 음수, 뒤에 있으면 양수, 같으면 0
        p(str1.compareTo(str1));
        p(str1.compareTo(str2));
        p(str2.compareTo(str1));

    }
}
