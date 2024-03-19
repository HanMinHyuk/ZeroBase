package _0x05_Stack;
// 옥상 정원 꾸미기
import java.util.*;
import java.io.*;

public class _05_6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        long result = 0;
        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(br.readLine());

            while (!stack.isEmpty()) {
                if (stack.peek() <= height) {
                    stack.pop();
                } else {
                    break;
                }
            }
            result += stack.size();

            stack.push(height);
        }
        System.out.println(result);
    }
}
