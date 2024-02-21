// 회전하는 큐
import java.util.*;

public class _02_1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();

        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = N; i >= 1; i--) {
            deque.addFirst(i);
        }

        int min = 0;
        for (int i = 0; i < M; i++) {
            int location = sc.nextInt();
            int a = 0; // 2번 연산
            int b = 0; // 3번 연산

            // 2번 연산을 한 것
            while (true) {
                if (deque.peekFirst() == location) {
                    break;
                } else {
                    deque.addLast(deque.removeFirst());
                    a++;
                }
            }

            // 다시 되돌리기
            for (int j = 0; j < a; j++) {
                deque.addFirst(deque.removeLast());
            }

            // 3번 연산을 한 것
            while (true) {
                if (deque.peekFirst() == location) {
                    deque.removeFirst();
                    break;
                } else {
                    deque.addFirst(deque.removeLast());
                    b++;
                }
            }

            if (a > b) {
                min += b;
            } else {
                min += a;
            }
        }

        System.out.println(min);

    }
}
