package _0x05_Old_DFS_BFS;
// 영역 구하기
import java.util.*;
import java.io.*;

public class _07_2583 {
    static int area;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> list;
    static int[][] pos = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st1.nextToken());
        int N = Integer.parseInt(st1.nextToken());
        int K = Integer.parseInt(st1.nextToken());

        area = 1;
        map = new int[M][N];
        visited = new boolean[M][N];
        list = new ArrayList<>();

        StringTokenizer st2;
        for (int i = 0; i < K; i++) {
            st2 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st2.nextToken());
            int y1 = Integer.parseInt(st2.nextToken());
            int x2 = Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());

            for (int j = y1; j < y2; j++) {
                for (int k = x1; k < x2; k++) {
                    map[j][k] = 1;
                    visited[j][k] = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    count++;
                    dfs(i, j);
                    list.add(area);
                    area = 1;
                }
            }
        }

        Collections.sort(list);

        System.out.println(count);
        for (int a : list) {
            System.out.print(a + " ");
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < pos.length; i++) {
            int nX = x + pos[i][0];
            int nY = y + pos[i][1];

            if (nX < 0 || nX > map.length - 1 || nY < 0 || nY > map[0].length - 1) {
                continue;
            }

            if (!visited[nX][nY] && map[nX][nY] == 0) {
                visited[nX][nY] = true;
                area++;
                dfs(nX, nY);
            }
        }
    }
}
