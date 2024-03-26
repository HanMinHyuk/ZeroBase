package _0x0B_Recursion;
// 하노이의 탑 이동순서
import java.util.*;
import java.io.*;

public class _02_11729 {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());

        ArrayList<int[]> list = hanoi(1, 3, 2, K);

        bw.write(list.size() + "\n");
        for (int[] k : list) {
            for (int num : k) {
                bw.write(num + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static ArrayList<int[]> hanoi(int start, int end, int support, int K) {
        if (K == 1) {
            ArrayList<int[]> result = new ArrayList<>();
            result.add(new int[]{start, end});
            return result;
        }

        ArrayList<int[]> result = hanoi(start, support, end, K-1);
        result.add(new int[]{start, end});
        result.addAll(hanoi(support, end, start, K-1));
        return result;
    }
}
