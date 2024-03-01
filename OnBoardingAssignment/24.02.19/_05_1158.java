import java.util.*;
import java.io.*;

public class _05_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 0; i < N; i++) {
            queue.offer(i+1);
        }

        sb.append("<");
        while (queue.size() != 1) {
            for (int i = 0; i < K-1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll());
            sb.append(", ");
        }
        sb.append(queue.poll());
        sb.append(">");

        System.out.println(sb);
    }
}
