import java.util.*;
import java.io.*;
// 백준 -> 후위표기식

public class _203_02_1918 {
    public static int priority(char temp) {
        if (temp == '(') {
            return 0;
        } else if (temp == '+' || temp == '-') {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            // 연산자 외에는 바로 출력
            if ('A' <= temp && temp <= 'Z') {
                sb.append(temp);
            } else if (temp == '(') { // 여는 괄호가 나오면 스택에 넣는다.
                stack.push(temp);
            } else if (temp == ')') { // 닫힌 괄호가 나오면 여는 괄호가 나올 때 까지 연산자를 출력해주고 여는 괄호가 나오면 스택에 삭제
                while (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    sb.append(stack.pop());
                }
            } else { // 연산자의 우선순위 판별
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(temp)) {
                    sb.append(stack.pop());
                }
                stack.push(temp);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
