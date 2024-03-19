package ch_03_01;

public class Sample3 {
    public static void main(String[] args) {

        String str1 = "홍길동";

        Object obj1 = new Object();

        System.out.println(obj1.hashCode());

        System.out.println(str1);
        System.out.println(str1.hashCode());

    }
}
