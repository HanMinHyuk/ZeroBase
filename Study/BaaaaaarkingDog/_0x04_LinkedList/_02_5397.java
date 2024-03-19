package _0x04_LinkedList;
// 키로거
import java.util.*;
import java.io.*;

public class _02_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());

        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            for (String s : str.split("")) {
                if (s.equals("<")) {
                    if (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                } else if (s.equals(">")) {
                    if (!stack2.isEmpty()) {
                        stack1.push(stack2.pop());
                    }
                } else if (s.equals("-")) {
                    if (!stack1.isEmpty()) {
                        stack1.pop();
                    }
                } else {
                    stack1.push(s);
                }

            }

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            while (!stack2.isEmpty()) {
                sb.append(stack2.pop());
            }

            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();

    }
}
