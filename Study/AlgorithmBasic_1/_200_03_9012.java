package _240220;
import java.util.*;
import java.io.*;

public class _200_03_9012 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack stack = new Stack();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            boolean checkFlag = true;
            String line = br.readLine();
            for (String s : line.split("")) {
                if (s.equals("(")) {
                    stack.push(s);
                } else {
                    if (stack.isEmpty()) {
                        checkFlag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (checkFlag && stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }

        }
        bw.flush();
        bw.close();*/

        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            boolean checkFlag = true;
            String line = sc.next();
            for (String s : line.split("")) {
                if (s.equals("(")) {
                    stack.push(s);
                } else {
                    if (stack.isEmpty()) {
                        checkFlag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (checkFlag && stack.isEmpty()) {
                System.out.println("YES");
                stack.clear();
            } else {
                System.out.println("NO");
                stack.clear();
            }

        }
    }
}
