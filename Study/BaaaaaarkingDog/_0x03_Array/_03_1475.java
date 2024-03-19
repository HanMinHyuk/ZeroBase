package _0x03_Array;
// 방 번호
import java.io.*;

public class _03_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        int[] arr = new int[10];

        for (char c : N.toCharArray()) {
            int num = c - '0';

            if (c == '6' || c == '9') {
                if (arr[6] == arr[9]) {
                    arr[9]++;
                } else {
                    arr[6]++;
                }
            } else {
                arr[num]++;
            }
        }

        int max = 0;
        for (int a : arr) {
            if (max < a) {
                max = a;
            }
        }

        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
}
