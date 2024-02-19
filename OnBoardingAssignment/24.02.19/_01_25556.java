// Baekjoon (포스택)
import java.nio.Buffer;
import java.util.*;
import java.io.*;

public class _01_25556 {
    public static void main(String[] args) throws IOException {
//        내 풀이
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        Stack<Integer> stack4 = new Stack<>();
        boolean possible = true;

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int Ai = Integer.parseInt(st.nextToken());
            A[i] = Ai;
        }

        stack1.push(0);
        stack2.push(0);
        stack3.push(0);
        stack4.push(0);

        for (int i = 0; i < N; i++) {
            if (A[i] >= stack1.peek()) {
                stack1.push(A[i]);
            } else if (A[i] >= stack2.peek()) {
                stack2.push(A[i]);
            } else if (A[i] >= stack3.peek()) {
                stack3.push(A[i]);
            } else if (A[i] >= stack4.peek()) {
                stack4.push(A[i]);
            } else {
                possible = false;
            }
        }

        if (possible) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }*/

//        다른 사람의 풀이
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();

        // n만큼 숫자를 입력해서 numbers에 저장한다.
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(sc.next()));
        }

        List<Stack<Integer>> stackList = new ArrayList<>();

        // 1부터 시작이므로 0을 미리 저장한다.
        for (int i = 0; i < 4; i++) {
            stackList.add(new Stack<>());
            stackList.get(i).push(0);
        }

        boolean isFlag = true; // YES와 NO를 출력하기 위한 bool형
        for (int number : numbers) {
            boolean isNumber = false;
            for (Stack<Integer> integers : stackList) {
                if (number > integers.peek()) {
                    integers.push(number);
                    isNumber = true;
                    break;
                }
            }

            if (!isNumber) {
                isFlag = false;
                break;
            }
        }

        if (isFlag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
