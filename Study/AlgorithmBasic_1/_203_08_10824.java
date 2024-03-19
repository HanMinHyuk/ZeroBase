import java.io.*;
import java.util.StringTokenizer;

public class _203_08_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String s1 = st.nextToken() + st.nextToken();
        String s2 = st.nextToken() + st.nextToken();

        long result = Long.parseLong(s1) + Long.parseLong(s2);
        System.out.println(result);
    }
}
