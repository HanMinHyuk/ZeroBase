package _0x05_Old_DFS_BFS;
// 토마토
import java.util.*;
import java.io.*;

public class _04_7576 {
    static int[][] map;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st1.nextToken());
        int N = Integer.parseInt(st1.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st2.nextToken());
                if (map[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1) {
                    bfs(i, j);
                }
            }
        }

        int answer = Integer.MIN_VALUE;
        Row:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (answer < map[i][j]) {
                    answer = map[i][j];
                }
                if (map[i][j] == 0) {
                    answer = -1;
                    break Row;
                }
            }
        }

        System.out.println((answer > 0) ? (answer - 1) : answer);
    }

    public static void bfs(int i, int j) {
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int X = current[0];
            int Y = current[1];

            for (int k = 0; k < 4; k++) {
                int nX = X + dx[k];
                int nY = Y + dy[k];

                if (nX < 0 || nX > map.length - 1 || nY < 0 || nY > map[0].length - 1) {
                    continue;
                }

                if (map[nX][nY] == 0) {
                    map[nX][nY] = map[X][Y] + 1;
                    queue.add(new int[]{nX, nY});
                }
            }
        }
    }
}
