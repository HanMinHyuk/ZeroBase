import java.io.*;
import java.util.*;
// 접미사 배열

public class _203_09_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        String[] sArr = new String[S.length()];

        for (int i = 0; i < S.length(); i++) {
            sArr[i] = S.substring(i);
        }

        Arrays.sort(sArr);

        for (String s : sArr) {
            System.out.println(s);
        }
    }
}
