package _240226;
// 코딩테스트 입문 -> 짝수는 싫어요
public class _01_Programmers {
    public int[] solution(int n) {
        int[] answer;

        if (n%2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }

        for (int i=0; i< answer.length; i++) {
            answer[i] = (i * 2) + 1;
        }

        return answer;

        // return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
        // rangeClosed(a, b)는 a ~ b 까지의 범위를 의미한다.
        // range(a, b)는 a ~ (b-1) 까지의 범위를 의미한다.
    }
}
