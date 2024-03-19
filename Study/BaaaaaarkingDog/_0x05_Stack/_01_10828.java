package _0x05_Stack;
// 스택
import java.util.*;
import java.io.*;

public class _01_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();

            switch (str) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case "pop":
                    if (!stack.isEmpty()) {
                        bw.write(stack.pop() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    if (!stack.isEmpty()) {
                        bw.write(0 + "\n");
                    } else {
                        bw.write(1 + "\n");
                    }
                    break;
                case "top":
                    if (!stack.isEmpty()) {
                        bw.write(stack.peek() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
