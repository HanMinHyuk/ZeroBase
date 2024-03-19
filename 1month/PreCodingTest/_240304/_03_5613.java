package _240304;
// 계산기 프로그램

import java.io.*;

public class _03_5613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = Integer.parseInt(br.readLine());

        while (true) {
            String input = br.readLine();
            if (input.equals("=")) {
                break;
            }

            int num = Integer.parseInt(br.readLine());

            if (input.equals("+")) {
                result += num;
            } else if (input.equals("-")) {
                result -= num;
            } else if (input.equals("*")) {
                result *= num;
            } else if (input.equals("/")) {
                result /= num;
            }
        }

        System.out.println(result);

    }
}
