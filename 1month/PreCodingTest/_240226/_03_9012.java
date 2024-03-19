package _240226;
// 괄호
import java.util.*;
import java.io.*;

public class _03_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        Stack<String> stack = new Stack();

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            boolean isFlag = true;

            for (String s : str.split("")) {
                if (s.equals("(")) {
                    stack.push(s);
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        isFlag = false;
                        break;
                    }
                }
            }

            if (isFlag && stack.isEmpty()) {
                bw.write("YES\n");
                stack.clear();
            } else {
                bw.write("NO\n");
                stack.clear();
            }
        }
        bw.flush();
        bw.close();
    }
}
