package _240220;

import java.util.*;

public class _200_04_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt();
        int start = 0;

        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();

            if (value > start) {
                for (int j = start + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start = value; // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.println(sb);
    }
}
