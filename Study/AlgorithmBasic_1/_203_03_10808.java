import java.util.*;
import java.io.*;

public class _203_03_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int[] result = new int[26];

        for (char c : S.toCharArray()) {
            int num = c - 'a';

            result[num]++;
        }

        for (int item : result) {
            bw.write(item + " ");
        }
        bw.flush();
        bw.close();

    }
}
