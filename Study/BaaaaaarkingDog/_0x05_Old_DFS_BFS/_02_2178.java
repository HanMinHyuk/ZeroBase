package _0x05_Old_DFS_BFS;
// 미로탐색
import java.util.*;
import java.io.*;

public class _02_2178 {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        int[][] arr = new int[n][m];
        int[][] visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < str.length; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        int answer = 0;
        bfs(arr, visited);
        answer = visited[n-1][m-1];

        System.out.println(answer);

    }

    public static void bfs(int[][] arr, int[][] visited) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{0, 0});
        visited[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int X = current[0];
            int Y = current[1];

            for (int i = 0; i < 4; i++) {
                int nX = X + dx[i];
                int nY = Y + dy[i];

                if (nX < 0 || nX > arr.length - 1 || nY < 0 || nY > arr[0].length - 1) {
                    continue;
                }

                if (arr[nX][nY] == 1 && visited[nX][nY] == 0) {
                    visited[nX][nY] = visited[X][Y] + 1;
                    queue.add(new int[]{nX, nY});
                }
            }
        }
    }

}
