package _0x03_Array;
// 알파벳 개수
import java.util.*;

public class _01_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int[] arr = new int[26];
        for (char c : S.toCharArray()) {
            int num = c - 'a';
            arr[num]++;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
