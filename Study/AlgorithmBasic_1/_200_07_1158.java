import java.util.*;

public class _200_07_1158 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        System.out.print("<");
        while (queue.size() != 1) {
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            System.out.print(queue.poll() + ", ");
        }

        System.out.print(queue.poll());
        System.out.print(">");
        System.out.println();
    }
}
