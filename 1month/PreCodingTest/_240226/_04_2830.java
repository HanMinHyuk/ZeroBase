package _240226;
import java.nio.Buffer;
import java.util.*;
import java.io.*;
// 행성 X3

public class _04_2830 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] names = new int[N];
        int[] count = new int[20]; // 1<= N <= 1,000,000 인데 1,000,000 = 1000^2 이고 2^9 < 1,000 < 2^10 이므로 20자리 이하까지 가능
        long sum = 0;

        // 모든 주민 이름 names 배열에 담기
        for (int i = 0; i < N; i++) {
            names[i] = Integer.parseInt(br.readLine());
        }

        // 각 자리수의 1의 개수 세기
        for (int i = 0; i < N; i++) {
            int name = names[i];
            int idx = 0;
            // 2진수 구할 때 처럼 2로 나누어서 나머지 구하고 2진수 구하는 방법
            while (name > 0) {
                count[idx++] += name % 2; // count[0]부터 idx를 1씩 증가시키며 비트가 1인 경우 1씩 저장

                name /= 2;
            }
        }

        // 행성 가치 구하기
        // 19와 10을 예로 들었을 때
        // 19의 2진수 : 1 0 0 1 1
        // 10의 2진수 : 0 1 0 1 0
        //  1의  개수 : 1 1 0 2 1
        //  0의  개수 : 1 1 2 0 1
        // 이 밑의 식은 ((1x1)x2^1 + (2x0)x2^2 + (0x2)x2^3 + (1x1)x2^4 + (1x1)x2^5) / 2 한 것과 동일
        for (int i = 19; i >= 0; i--) {
            sum += (long) count[i] * (N - count[i]); // 비트가 1인 경우의 개수 * 비트가 0인 경우의 개수

            sum <<= 1; // sum * 2^1 과 같은 효과
        }
        sum >>= 1;

        System.out.println(sum);
    }
}

// 행성X3 해설 : https://muunii.tistory.com/4
