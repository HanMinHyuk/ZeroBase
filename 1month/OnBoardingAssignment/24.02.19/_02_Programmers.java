import java.util.*;

public class _02_Programmers {
    public static void main(String[] args) {
        _02_Programmers k = new _02_Programmers();

        k.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});

    }

    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i<progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.add((100 - progresses[i]) / speeds[i]);
            } else {
                queue.add(((100 - progresses[i]) / speeds[i]) + 1);
            }

        // Math.ceil()을 써도 가능 -> 이 메소드는 3.1일때 무조건 4로 바꿔줌. 소수점이 1 이상이면 무조건 올림한다.
        }

        while (!queue.isEmpty()) {
            int a = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && a >= queue.peek()) { // peek()은 null 값을 반환하기 때문에 nullPointerException 예외가 발생,
                queue.poll();                               // 그래서 앞에 !queue.isEmpty()을 붙여줌으로써 예외처리 가능
                count++;
            }

            answer.add(count);
        }

        return answer;
    }
}
