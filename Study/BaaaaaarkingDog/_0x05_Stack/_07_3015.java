package _0x05_Stack;
// 오아시스 재결합
import java.util.*;
import java.io.*;

class Pair {
    int height;
    int cnt;

    public Pair(int height, int cnt) {
        this.height = height;
        this.cnt = cnt;
    }

}


public class _07_3015 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Pair> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        long count = 0;
        for (int i = 1; i <= N; i++) {
            int a = Integer.parseInt(br.readLine());
            Pair pair = new Pair(a, 1);

            while (!stack.isEmpty() && stack.peek().height <= a) {
                Pair pop = stack.pop();
                count += pop.cnt;
                if (pop.height == a) {
                    pair.cnt += pop.cnt;
                }
            }

            if (!stack.isEmpty()) {
                count++;
            }

            stack.push(pair);
        }

        System.out.println(count);
    }
}
