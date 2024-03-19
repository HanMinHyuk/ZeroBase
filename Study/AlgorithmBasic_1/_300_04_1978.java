import java.util.*;
import java.io.*;

public class _300_04_1978 {
    public static void main(String[] args) throws IOException {
//         내 풀이
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean isCheck = true;

            if (num == 1) {
                isCheck = false;
                continue;
            }

            for (int j = 2; j <= num/2; j++) {
                if (num%j == 0) {
                    isCheck = false;
                    break;
                }
            }

            if (isCheck) {
               cnt++;
            }
        }
        System.out.println(cnt);*/

//         다른 사람의 풀이
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            boolean isPrime = true;
            int num = sc.nextInt();

            if (num==1) {
                continue;
            }

            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
