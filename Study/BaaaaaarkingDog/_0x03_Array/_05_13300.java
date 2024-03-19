package _0x03_Array;
import java.io.*;
import java.util.*;

public class _05_13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st1.nextToken());
        int K = Integer.parseInt(st1.nextToken());
        int[][] arr = new int[6][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st2.nextToken());
            int Y = Integer.parseInt(st2.nextToken());

            arr[Y - 1][S]++;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    if (arr[i][j] > K) {
                        if (arr[i][j] % K != 0) {
                            cnt = cnt + (arr[i][j]/K) + 1;
                        } else {
                            cnt = cnt + (arr[i][j]/K);
                        }
                    } else {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
