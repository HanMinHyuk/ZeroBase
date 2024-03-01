import java.io.*;
import java.util.*;

public class _201_02_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                stack.pop();
                if (str.charAt(i-1) == '(') {
                    cnt += stack.size();
                } else {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
