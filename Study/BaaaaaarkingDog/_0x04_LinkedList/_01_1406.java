package _0x04_LinkedList;
// 에디터
import java.io.*;
import java.util.*;

public class _01_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int M = Integer.parseInt(br.readLine());

        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        for (String s : str.split("")) {
            stack1.push(s);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();

            switch (a) {
                case "L":
                    if (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                    break;
                case "D":
                    if (!stack2.isEmpty()) {
                        stack1.push(stack2.pop());
                    }
                    break;
                case "B":
                    if (!stack1.isEmpty()) {
                        stack1.pop();
                    }
                    break;
                case "P":
                    stack1.push(st.nextToken());
                    break;
            }
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        while (!stack2.isEmpty()) {
            sb.append(stack2.pop());
        }

        System.out.println(sb.toString());
    }
}
