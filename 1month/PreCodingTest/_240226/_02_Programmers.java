package _240226;
// 2021 카카오 채용연계형 인턴십 -> 숫자 문자열과 영단어
import java.util.*;

public class _02_Programmers {
    // 내 풀이...
    /*public int solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();

        int cnt = 0;
        while (cnt < arr.length) {
            if (arr[cnt] == 'e') {
                if (arr[cnt + 1] == 'i') {
                    answer += "8";
                    cnt += 5;
                    continue;
                }
            } else if (arr[cnt] == 'f') {
                if (arr[cnt + 1] == 'o') {
                    answer += "4";
                    cnt += 4;
                    continue;
                } else if (arr[cnt + 1] == 'i') {
                    answer += "5";
                    cnt += 4;
                    continue;
                }
            } else if (arr[cnt] == 'n') {
                if (arr[cnt + 1] == 'i') {
                    answer += "9";
                    cnt += 4;
                    continue;
                }
            } else if (arr[cnt] == 'o') {
                if (arr[cnt + 1] == 'n') {
                    answer += "1";
                    cnt += 3;
                    continue;
                }
            } else if (arr[cnt] == 's') {
                if (arr[cnt + 1] == 'i') {
                    answer += "6";
                    cnt += 3;
                    continue;
                } else if (arr[cnt + 1] == 'e') {
                    answer += "7";
                    cnt += 5;
                    continue;
                }
            } else if (arr[cnt] == 't') {
                if (arr[cnt + 1] == 'w') {
                    answer += "2";
                    cnt += 3;
                    continue;
                } else if (arr[cnt + 1] == 'h') {
                    answer += "3";
                    cnt += 5;
                    continue;
                }
            } else if (arr[cnt] == 'z') {
                if (arr[cnt + 1] == 'e') {
                    answer += "0";
                    cnt += 4;
                    continue;
                }
            } else {
                answer += arr[cnt];
                cnt++;
                continue;
            }
        }


        return Integer.parseInt(answer);
    }*/

    // 다른 사람의 풀이 (대단하다 진짜..)
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

    }
}
