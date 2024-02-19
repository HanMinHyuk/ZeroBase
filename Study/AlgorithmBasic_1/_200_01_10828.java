package _240219;
import java.io.*;
import java.util.*;

public class _200_01_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));//reader선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//writer선언
        StringTokenizer st;//tokenizer 선언

        int N = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());

            String command = st.nextToken();

            if (command.equals("push")) {
                int a = Integer.parseInt(st.nextToken());
                stack.push(a);
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            } else if (command.equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (command.equals("empty")) {
                if (stack.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
