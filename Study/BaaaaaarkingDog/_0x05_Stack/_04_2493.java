package _0x05_Stack;
// 탑
import java.util.*;
import java.io.*;

class Top { // 탑에 대한 정보
    int num; // 탑의 번호
    int height; // 탑의 높이

    Top(int num, int height) {
        this.num = num;
        this.height = height;
    }
}

public class _04_2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        Stack<Top> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int height = Integer.parseInt(st.nextToken());

            if (stack.isEmpty()) {
                sb.append("0 ");
                stack.push(new Top(i, height));
            } else {
                while (true) {
                    if (stack.isEmpty()) {
                        sb.append("0 ");
                        stack.push(new Top(i, height));
                        break;
                    }

                    Top top = stack.peek();

                    if (top.height > height) {
                        sb.append(top.num + " ");
                        stack.push(new Top(i, height));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
