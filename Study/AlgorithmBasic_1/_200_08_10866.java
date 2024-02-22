import java.io.*;
import java.util.*;
public class _200_08_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();

            switch (str) {
                case "push_front":
                    int X = Integer.parseInt(st.nextToken());
                    deque.offerFirst(X);
                    break;
                case "push_back":
                    int Y = Integer.parseInt(st.nextToken());
                    deque.offerLast(Y);
                    break;
                case "pop_front":
                    if (!deque.isEmpty()) {
                        bw.write(deque.pollFirst() + "\n");
                        break;
                    } else {
                        bw.write(-1 + "\n");
                        break;
                    }
                case "pop_back":
                    if (!deque.isEmpty()) {
                        bw.write(deque.pollLast() + "\n");
                        break;
                    } else {
                        bw.write(-1 + "\n");
                        break;
                    }
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    if (!deque.isEmpty()) {
                        bw.write(0 + "\n");
                        break;
                    } else {
                        bw.write(1 + "\n");
                        break;
                    }
                case "front":
                    if (!deque.isEmpty()) {
                        bw.write(deque.peekFirst() + "\n");
                        break;
                    } else {
                        bw.write(-1 + "\n");
                        break;
                    }
                case "back":
                    if (!deque.isEmpty()) {
                        bw.write(deque.peekLast() + "\n");
                        break;
                    } else {
                        bw.write(-1 + "\n");
                        break;
                    }
            }
        }
        bw.flush();
        bw.close();
    }

}
