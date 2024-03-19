package _0x05_Stack;
// 제로
import java.util.*;
import java.io.*;

public class _02_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                result -= stack.pop();
            } else {
                result += stack.push(num);
            }
        }

        System.out.println(result);
    }
}
