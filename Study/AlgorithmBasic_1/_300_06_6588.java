import java.util.*;
import java.io.*;

public class _300_06_6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] isFlag = new boolean[1_000_001];

        isFlag[0] = true;
        isFlag[1] = true;

        for (int i = 2; i < Math.sqrt(1_000_000); i++) {
            if (isFlag[i] == true) {
                continue;
            }

            for (int j = i * i; j < 1_000_001; j = j + i) {
                isFlag[j] = true;
            }
        }

        int input;
        while ((input = Integer.parseInt(br.readLine())) != 0) {
            if (input < 6) {
                bw.write("Goldbach's conjecture is wrong\n");
                break;
            }

            boolean isCheck = true;

            for (int i = 3; i < input; i++) {
                if (!isFlag[i] && !isFlag[input - i]) {
                    isCheck = false;
                    bw.write(input  + " = " + i + " + " + (input - i) + "\n");
                    break;
                }
            }

            if (isCheck) {
                bw.write("Goldbach's conjecture is wrong\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
