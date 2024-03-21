package _0x05_Old_DFS_BFS;
// 유기농 배추
import java.util.*;
import java.io.*;

public class _03_1012 {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st1.nextToken());
            int N = Integer.parseInt(st1.nextToken());
            int K = Integer.parseInt(st1.nextToken());

            int[][] map = new int[N][M];
            boolean[][] visited = new boolean[N][M];

            StringTokenizer st2;
            for (int j = 0; j < K; j++) {
                st2 = new StringTokenizer(br.readLine());
                int miniM = Integer.parseInt(st2.nextToken());
                int miniN = Integer.parseInt(st2.nextToken());
                map[miniN][miniM] = 1;
            }

            int count = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (!visited[j][k] && map[j][k] == 1) {
                        count++;
                        bfs(map, visited, j, k);
                    }
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void bfs(int[][] map, boolean[][] visited, int j, int k) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{j, k});
        visited[j][k] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int X = current[0];
            int Y = current[1];

            for (int i = 0; i < 4; i++) {
                int nX = X + dx[i];
                int nY = Y + dy[i];

                if (nX < 0 || nX > map.length - 1 || nY < 0 || nY > map[0].length - 1) {
                    continue;
                }

                if (map[nX][nY] == 1 && !visited[nX][nY]) {
                    visited[nX][nY] = true;
                    queue.add(new int[]{nX, nY});
                }
            }
        }
    }
}
