package _240304;
import java.util.*;
// 한 번만 등장한 문자

public class _01_Programmers {
    public String solution(String s) {
//        내 풀이
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();

        for (String str : s.split("")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key).equals(1)) {
                arr.add(key);
            }
        }

        Collections.sort(arr);
        StringBuilder answer = new StringBuilder();

        for (String str : arr) {
            answer.append(str);
        }

        return answer.toString();

//         다른 사람의 풀이
        /*int[] alpha = new int[26];
        for(char c : s.toCharArray()){
            alpha[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(alpha[i] == 1){
                answer.append((char)(i + 'a'));
            }
        }
        return answer.toString();*/

    }
}
