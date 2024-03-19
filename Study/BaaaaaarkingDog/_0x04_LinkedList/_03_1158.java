package _0x04_LinkedList;
// 요세푸스 문제
import java.io.*;
import java.util.*;

public class _03_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.offer(i+1);
        }

        sb.append("<");
        while (!queue.isEmpty()) {
            for (int i = 0; i < K-1; i++) {
                queue.offer(queue.remove());
            }

            if (queue.size() == 1) {
                sb.append(queue.remove());
                break;
            } else {
                sb.append(queue.remove() + ", ");
            }
        }
        sb.append(">");

        System.out.println(sb.toString());
    }
}
