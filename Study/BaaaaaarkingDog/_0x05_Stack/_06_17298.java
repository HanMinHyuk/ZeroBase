package _0x05_Stack;
// 오큰수
import java.util.*;
import java.io.*;

public class _06_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int A = Integer.parseInt(br.readLine());
        int[] arr = new int[A];
        int[] result = new int[A];
        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            while (true) {
                if (!stack.isEmpty() && arr[stack.peek()] < num) {
                    result[stack.pop()] = num;
                } else {
                    break;
                }
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
