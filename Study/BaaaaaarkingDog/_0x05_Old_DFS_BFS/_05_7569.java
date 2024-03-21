package _0x05_Old_DFS_BFS;
// 토마토 2
import java.util.*;
import java.io.*;

public class _05_7569 {
    static int[][][] map;
    static int[] dx = {0, 1, 0, -1, 0, 0};
    static int[] dy = {1, 0, -1, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st1.nextToken());
        int N = Integer.parseInt(st1.nextToken());
        int K = Integer.parseInt(st1.nextToken());

        map = new int[N][M][K];

        for (int k = 0; k < K; k++) {
            for (int i = 0; i < N; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    map[i][j][k] = Integer.parseInt(st2.nextToken());
                    if (map[i][j][k] == 1) {
                        queue.add(new int[]{i, j, k});
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < K; k++) {
                    if (map[i][j][k] == 1) {
                        bfs(i, j, k);
                    }
                }
            }
        }

        int answer = Integer.MIN_VALUE;
        Row:
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < K; k++) {
                    if (answer < map[i][j][k]) {
                        answer = map[i][j][k];
                    }
                    if (map[i][j][k] == 0) {
                        answer = -1;
                        break Row;
                    }
                }
            }
        }

        System.out.println((answer > 0) ? (answer - 1) : answer);
    }

    public static void bfs(int i, int j, int k) {
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int X = current[0];
            int Y = current[1];
            int Z = current[2];

            for (int l = 0; l < 6; l++) {
                int nX = X + dx[l];
                int nY = Y + dy[l];
                int nZ = Z + dz[l];

                if (nX < 0 || nX > map.length - 1 || nY < 0 || nY > map[0].length - 1 || nZ < 0 || nZ > map[0][0].length - 1) {
                    continue;
                }

                if (map[nX][nY][nZ] == 0) {
                    map[nX][nY][nZ] = map[X][Y][Z] + 1;
                    queue.add(new int[]{nX, nY, nZ});
                }
            }

        }
    }
}
