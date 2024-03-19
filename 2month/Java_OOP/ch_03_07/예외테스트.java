package ch_03_07;

public class 예외테스트 {

    public static void method1(int i, int j) throws Exception {

        if (j == 0) {
            throw new Exception("0으로 나눌 수 없습니다.");
        }


         int k = i / j;
        System.out.println(k);

    }

    public static void main(String[] args) {

        /*
        int[] i = {10, 20};

        System.out.println(i[3]);

        // 예외처리 방법
        // 1. 내가 try catch 한다.
        // 2. throw 한다. 넘긴다.

        try {
            Class.forName("abc");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {

        }
        */

        try {
            method1(1, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
