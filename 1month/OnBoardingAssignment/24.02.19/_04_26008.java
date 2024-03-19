import java.nio.Buffer;
import java.util.*;
import java.io.*;
import java.util.Map.Entry;

public class _04_26008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<long[], Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        long H = Integer.parseInt(br.readLine());

        long[] arr = new long[M];
        for (int i = 0; i < M; i++) {
            arr[i] = i;
        }

        long[] out = new long[N];
        permutation(arr, out, 0, N, M, A, map);



        long cnt = 0;
        Collection<Integer> values = map.values();
        for (long k : values) {
            if (k == H) {
                cnt++;
            }
        }

        bw.write((long)cnt%1_000_000_007 + "\n");
        bw.flush();
        bw.close();
    }

    public static void permutation(long[] arr, long[] out, int depth, long r, long M, long A, HashMap<long[], Integer> map) {
        if (depth == r) {
            long[] out2 = out.clone();
            int k = 0;
            for (int i = 0; i < out.length; i++) {
                k += out2[i] * (long)Math.pow(A, i);
            }
            k %= M;
            map.put(out2, k);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            out[depth] = arr[i];
            permutation(arr, out, depth + 1, r, M, A, map);
        }
    }
}
