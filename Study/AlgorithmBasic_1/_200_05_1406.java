package _240221;
import java.util.*;
import java.io.*;

public class _200_05_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine();
        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();

        int M = Integer.parseInt(br.readLine());

        for (String s : str.split("")) {
            leftStack.push(s);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (s.equals("L")) {
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if (s.equals("D")) {
                if (!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
            } else if (s.equals("B")) {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            } else if (s.equals("P")) {
                String alphabet = st.nextToken();
                leftStack.push(alphabet);
            }
        }

        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        while (!rightStack.isEmpty()) {
            bw.write(rightStack.pop());
        }

        bw.flush();
        System.out.println();
        bw.close();


    }
}
