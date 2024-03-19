import java.util.*;

public class _04_Programmers {
    public static void main(String[] args) {
        String[][] clothes = {{"1", "1"}, {"2", "2"}, {"3", "1"}, {"4", "4"}, {"5", "4"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        int cnt = 0;

        for (int i=0; i<clothes.length; i++) {
            String key = clothes[i][1];
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }

            map.get(key).add(clothes[i][0]);
            cnt++;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            arr.add(map.get(key).size());
        }

        if (arr.size() != 1) {
            for (int i=0; i<arr.size(); i++) {
                for (int j=i+1; j<arr.size(); j++) {
                    cnt += arr.get(i) * arr.get(j);
                }
            }

            if (arr.size() > 2) {
                int all = arr.get(arr.size() - 1);
                for (int i=arr.size() - 2; i>=0; i--) {
                    all *= arr.get(i);
                }
                cnt += all;
            }
        }

        return cnt;
    }
}
