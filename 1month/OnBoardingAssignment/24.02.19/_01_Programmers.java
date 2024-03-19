// 같은 숫자는 싫어
import java.util.*;
public class _01_Programmers {
    public Stack<Integer> solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int a : arr) {
            if (stack.isEmpty()) {
                stack.push(a);
            } else {
                if (stack.peek() == a) {
                    continue;
                } else {
                    stack.push(a);
                }
            }
        }


        return stack;
    }
}
