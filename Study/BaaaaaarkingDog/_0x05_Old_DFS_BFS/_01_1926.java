package _0x05_Old_DFS_BFS;
// 그림
import java.util.*;
import java.io.*;

public class _01_1926 {

    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());

        arr = new int[a][b];
        visited = new boolean[a][b];

        for (int i = 0; i < a; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < b; j++) {
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        int count = 0;
        int max = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (!visited[i][j] && arr[i][j] == 1) {
                    int k = bfs(i, j);
                    max = Math.max(max, k);
                    count++;
                }
            }
        }

        System.out.println(count);
        System.out.println(max);
    }

    public static int bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        int sum = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int X = current[0];
            int Y = current[1];

            for (int k = 0; k < 4; k++) {
                int nX = X + dx[k];
                int nY = Y + dy[k];

                if (nX < 0 || nX > arr.length - 1 || nY < 0 || nY > arr[0].length - 1) {
                    continue;
                }

                if (arr[nX][nY] == 1 && !visited[nX][nY]) {
                    queue.add(new int[]{nX, nY});
                    visited[nX][nY] = true;
                    sum++;
                }
            }
        }

        return sum;
    }

}
