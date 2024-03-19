import java.util.*;
import java.io.*;

public class _300_02_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcd = getGCD(num1, num2);
        int lcm = (num1 * num2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }

        return getGCD(num2, num1 % num2);
    }
}
