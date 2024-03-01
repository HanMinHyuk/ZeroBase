import java.util.*;
import java.io.*;
// 백준 -> 후위 표기식 2

public class _203_01_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        String data = br.readLine();

        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        double result = 0;
        for (int i = 0; i < data.length(); i++) {
            if ('A' <= data.charAt(i) && data.charAt(i) <= 'Z') {
                stack.push(arr[data.charAt(i) - 'A']);
            } else if (!stack.isEmpty()) {
                double first = stack.pop();
                double second = stack.pop();
                switch (data.charAt(i)) {
                    case '+':
                        result = second + first;
                        stack.push(result);
                        continue;
                    case '-':
                        result = second - first;
                        stack.push(result);
                        continue;
                    case '*':
                        result = second * first;
                        stack.push(result);
                        continue;
                    case '/':
                        result = second / first;
                        stack.push(result);
                        continue;
                }
            }
        }

        System.out.printf("%.2f\n", stack.pop());

        stack.clear();
        br.close();

    }
}
