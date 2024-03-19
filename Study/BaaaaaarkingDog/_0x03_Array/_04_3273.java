package _0x03_Array;
// 두 수의 합

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _04_3273 {
    public static void main(String[] args) throws IOException {
//         풀이 1
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int X = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int p1 = 0;
        int p2 = arr.length - 1;
        int cnt = 0;
        while (p1 < p2) {
            int sum = arr[p1] + arr[p2];

            if (sum == X) {
                cnt++;
                p1++;
                p2--;
            } else if (sum < X) {
                p1++;
            } else {
                p2--;
            }
        }

        System.out.println(cnt);*/

        // 풀이 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }

        int X = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i=0; i<arr.length; i++) {
            if (set.contains(X - arr[i])) {
                cnt++;
            }
        }

        System.out.println(cnt/2);
    }
}
