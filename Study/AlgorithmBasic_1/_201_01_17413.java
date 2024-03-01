// 단어 뒤집기 2
// 꺽새 내부는 동일하게 처리하되, 꺽새가 아닌 경우 단어를 뒤집어 줘야 한다.

import java.io.*;
import java.util.*;

public class _201_01_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        // 결과 값을 출력할 StringBuilder
        StringBuilder sb = new StringBuilder();

        // 열린 꺽새와 닫힌 꺽새를 판별하기 위한 flag
        boolean flag = false;

        // 후입선출 기능을 이용하기 위한 자료구조 Stack (단어 뒤집을 때 유용)
        Stack<Character> stack = new Stack<>();

        // 문자열 str의 길이만큼 반복문 수행
        for (int i = 0; i < str.length(); i++) {
            // 열린 꺽새를 만났을 경우, stack이 비어있지 않다면 모든 원소를 꺼내고 flag를 true
            if (str.charAt(i) == '<') {
                // 공백이 없고 바로 '<'이 나왔을 때 사용
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }

                flag = true;
            } else if (str.charAt(i) == '>') {
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }

            // flag가 true일 경우, '>'를 만나기 전까지 그대로 입력
            if (flag == true) {
                sb.append(str.charAt(i));
            } else if (flag == false) {
                // 해당 인덱스의 i번째 문자가 공백일 경우, 모든 원소를 pop수행 후 공백 추가
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                } else {
                    // 그 외의 경우, Stack에 문자 추가
                    stack.push(str.charAt(i));
                }
            }

            // 반복문이 마지막 횟수일 때, 스택이 비어있지 않다면 원소 추가
            if (i == str.length() - 1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        // 결과문 출력
        System.out.println(sb);
    }
}

