import java.util.*;
public class Test2 {
    // 내 풀이 (순열을 이용해서 풀었지만 시간초과로 인해 실패)
    public String solution(int[] numbers) {

        boolean[] visited = new boolean[numbers.length];
        int[] out = new int[numbers.length];
        ArrayList<String> str = new ArrayList();

        permutation(numbers, 0, numbers.length, numbers.length, visited, out, str);

        Collections.sort(str);


        return str.get(str.size() - 1);
    }

    public static void permutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out, ArrayList<String> str) {
        if (depth == r) {
            int[] out2 = out.clone();
            String s = "";
            for (int a : out2) {
                s += a + "";
            }
            str.add(s);
            return;
        }

        for (int i=0; i<n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, depth + 1, n, r, visited, out, str);
                visited[i] = false;
            }
        }
    }

    // 풀이 정답
    /*public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        // int형 numbers 배열의 각 데이터를 String 객체로 변환하여 arr 배열에 대입
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 내림차순 정렬 (데이터가 String 객체 타입이므로 문자열로 내림차순을 한다.
        Arrays.sort(arr, (x, y) -> (y + x).compareTo(x + y));

        *//*Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                return (y+x).compareTo(x+y);
            }
        });*//*



        // 만약 제일 앞의 데이터 값이 0일 경우 그 다음의 값들도 모두 0 이므로 0으로 반환하는 return 값 만들기
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }

        return answer.toString();
    }*/

}
