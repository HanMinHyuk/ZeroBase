import java.util.*;

public class Test1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];                // 결과를 출력하기 위한 배열

        // answer 배열에 결과가 출력된 숫자를 넣기 위한 반복문
        for (int i=0; i<commands.length; i++) {
            int I = commands[i][0];                             // i번째 숫자부터
            int J = commands[i][1];                             // j번째 숫자까지
            int K = commands[i][2];                             // k번째에 있는 수

            int[] newArr = new int[J - I + 1];                  // i번째 부터 j번째 까지 자른 배열

            // newArr 배열에 i번째 부터 j번째 까지 숫자를 넣을 반복문
            int cnt = 0;                                        // newArr 배열의 index
            for (int j=I-1; j<J; j++) {
                newArr[cnt] = array[j];
                cnt++;
            }
//            int[] newArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);

            Arrays.sort(newArr);                                // newArr 배열 정렬

            answer[i] = newArr[K - 1];                          // answer 배열에 k번째에 있는 수 대입
        }


        return answer;
    }
}
