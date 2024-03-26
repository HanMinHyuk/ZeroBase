package _0x0B_Recursion;
// 곱셈
// https://st-lab.tistory.com/237
import java.util.*;
import java.io.*;

public class _01_1629 {

    static int count;

    public static long C;

    public static long pow(long A, long exponent) {

        // 지수가 1일 경우 A^1이므로 A를 그대로 리턴
        if (exponent == 1) {
            return A % C;
        }

        // 지수의 절반에 해당하는 A^(exponent/2)을 구한다.
        long temp = pow(A, exponent/2);

        /*
        현재 지수가 홀수 였다면
        A^(component/2) * A^(component/2) * A 이므로
        A를 한번 더 곱해주어야 한다.
        ex) A^9 = A^4 * A^4 * A
         */
        if (exponent%2 == 1) {
            return ((temp * temp % C) * (A % C)) % C;
        }

        // 그 외에는 짝수이므로 구했던 값을 한번 더 곱해서 반환한다.
        return temp * temp % C;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        System.out.println(pow(A, B));

    }
}
