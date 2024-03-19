package _0x03_Array;
// 숫자의 개수
import java.io.*;

public class _02_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;

        String str = String.valueOf(result);
        int[] arr = new int[10];

        for (String s : str.split("")) {
            int num = Integer.parseInt(s);
            arr[num]++;
        }

        for (int k : arr) {
            bw.write(k + "\n");
        }
        bw.flush();
        bw.close();
    }
}
