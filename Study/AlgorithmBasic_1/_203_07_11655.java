import java.nio.Buffer;
import java.util.*;
import java.io.*;

public class _203_07_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        for (char c : S.toCharArray()) {

            if ('A' <= c && c <= 'Z') {
                int num1 = c - 'A';
                num1 = (num1 + 13) % 26;

                bw.write((char)(num1 + 'A'));
            } else if ('a' <= c && c <= 'z') {
                int num1 = c - 'a';
                num1 = (num1 + 13) % 26;

                bw.write((char)(num1 + 'a'));
            } else {
                bw.write(c);
            }
        }
        bw.flush();
        bw.close();

    }
}
