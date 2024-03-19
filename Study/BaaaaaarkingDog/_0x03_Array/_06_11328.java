package _0x03_Array;

import java.util.*;
import java.io.*;

public class _06_11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        TestCase: for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String word1 = st.nextToken();
            String word2 = st.nextToken();

            int[] arr = new int[26];
            for (int j = 0; j < word1.length(); j++) {
                arr[word1.charAt(j) - 'a']++;
            }

            for (int j = 0; j < word2.length(); j++) {
                arr[word2.charAt(j) - 'a']--;
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0) {
                    bw.write("Impossible\n");
                    continue TestCase;
                }
            }
            bw.write("Possible\n");
        }
        bw.flush();
        bw.close();
    }
}
