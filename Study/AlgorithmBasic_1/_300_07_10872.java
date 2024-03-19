import java.util.*;
import java.io.*;

public class _300_07_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N < 1) {
            System.out.println(1);
        } else {
            System.out.println(factorial(N));
        }

        System.out.println(Math.log(2));

    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
