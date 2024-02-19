package _240219;

import java.io.*;
import java.util.*;

public class _200_02_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Stack stack = new Stack();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                for (String s : str.split("")) {
                    stack.push(s);
                }
                String result = "";
                while (!stack.isEmpty()) {
                    result = result + stack.pop();
                }
                bw.write(result + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
