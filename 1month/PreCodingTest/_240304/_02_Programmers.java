package _240304;
// 배열 회전시키기

public class _02_Programmers {
    public int[] solution(int[] numbers, String direction) {
//         내 풀이
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
            for (int i=0; i<numbers.length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
        } else {
            for (int j=0; j<answer.length - 1; j++) {
                answer[j] = numbers[j + 1];
            }
            answer[answer.length - 1] = numbers[0];
        }

        return answer;
    }
}
