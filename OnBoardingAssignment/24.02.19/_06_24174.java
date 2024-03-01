import java.util.*;
import java.io.*;

public class _06_24174 {
    static StringBuilder result = new StringBuilder();
    static int cnt = 0;
    public static int k; // 이 수에서 어떤 배열이 정렬되었는지 파악
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st1.nextToken());
        k = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // arr[1]부터 배열 생성 (arr[0]는 더미데이터 0)
        int[] arr = new int[A+1];
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        heapSort(arr);
    }

    public static void heapSort(int[] arr) {
        int n = arr.length - 1;

        buildMinHeap(arr, n);    // A[1...n]을 정렬한다.

        for (int i = n; i >= 2; i--) {
            swap(arr, 1, i);     // A[1] <-> A[i] 원소 교환
            heapify(arr, 1, i - 1);
        }

        if (flag) {
            System.out.println(result);
        } else {
            System.out.println("-1");
        }
    }

    public static void buildMinHeap(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(arr, i, n);
        }
    }

    public static void heapify(int[] arr, int parentIdx, int n) {
        int leftIdx = 2 * parentIdx;
        int rightIdx = 2 * parentIdx + 1;
        int smaller = 0;

        if (rightIdx <= n) {
            if (arr[leftIdx] < arr[rightIdx]) {
                smaller = leftIdx;
            } else {
                smaller = rightIdx;
            }
        } else if (leftIdx <= n) {
            smaller = leftIdx;
        } else {
            return;
        }

        if (arr[smaller] < arr[parentIdx]) {
            swap(arr, parentIdx, smaller);
            heapify(arr, smaller, n);
        }
    }

    public static void swap(int[] arr, int x, int y) {
        cnt++;

        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;

        if (cnt == k) {
            flag = true;
            for (int l = 1; l < arr.length; l++) {
                result.append(arr[l] + " ");
            }
        }
    }
}
