import java.util.*;
import java.io.*;

public class _203_05_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";

        while ((input = br.readLine()) != null) {
            char[] cArr = input.toCharArray();
            int[] count = new int[4]; // (소문자, 대문자, 숫자, 공백)
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < cArr.length; i++) {
                char c = cArr[i];

                if ('a' <= c && c <= 'z') {
                    count[0]++;
                } else if ('A' <= c && c<= 'Z') {
                    count[1]++;
                } else if ('0' <= c && c <= '9') {
                    count[2]++;
                } else {
                    count[3]++;
                }
            }

            for (int i = 0; i < count.length; i++) {
                if (i == count.length - 1) {
                    bw.write(count[i] + "\n");
                } else {
                    bw.write(count[i] + " ");
                }
            }
        }
        bw.flush();
        System.out.println();
        bw.close();
    }
}
