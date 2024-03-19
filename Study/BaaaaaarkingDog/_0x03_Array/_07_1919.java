package _0x03_Array;
import java.util.*;
import java.io.*;

public class _07_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a']--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                cnt += Math.abs(arr[i]);
            }
        }
        System.out.println(cnt);
    }
}
