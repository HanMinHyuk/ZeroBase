import java.util.*;
import java.io.*;

public class _300_05_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] flag = new boolean[N + 1];

        flag[0] = true;
        flag[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (flag[i] == true) {
                continue;
            }

            for (int j = i * i; j < N + 1; j=j+i) {
                flag[j] = true;
            }
        }

        for (int k = M; k <= N; k++) {
            if (flag[k] == false) {
                System.out.println(k);
            }
        }
    }
}
