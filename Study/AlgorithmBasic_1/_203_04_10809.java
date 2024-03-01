import java.io.*;
import java.util.*;

public class _203_04_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int[] result = new int[26];
        char[] cArr = S.toCharArray();

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        for (int j = 0; j < cArr.length; j++) {
            int num = cArr[j] - 'a';

            if (result[num] == -1) {
                result[num] = j;
            }
        }

        for (int item : result) {
            bw.write(item + " ");
        }
        bw.flush();
        bw.close();

    }
}
