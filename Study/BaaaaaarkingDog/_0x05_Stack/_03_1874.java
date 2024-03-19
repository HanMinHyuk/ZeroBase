package _0x05_Stack;
// 스택 수열
import java.util.*;
import java.io.*;

public class _03_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        stack.push(arr[0]);
        sb.append("+").append("\n");

        int idx = 1;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            while (true) {
                if (!stack.isEmpty() && stack.peek() == num) {
                    stack.pop();
                    sb.append("-").append("\n");
                    break;
                }

                if (idx < arr.length) {
                    stack.push(arr[idx]);
                    sb.append("+").append("\n");
                    idx++;
                } else {
                    break;
                }

            }
        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}
