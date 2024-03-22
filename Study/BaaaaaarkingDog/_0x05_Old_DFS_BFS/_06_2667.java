package _0x05_Old_DFS_BFS;
// 단지번호붙이기
import java.util.*;
import java.io.*;

public class _06_2667 {
    static int homeNum;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> list;
    static int[][] pos = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N < 5) {
            return;
        }

        homeNum = 1;
        map = new int[N][N];
        visited = new boolean[N][N];
        list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < str.length; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    count++;
                    dfs(i, j);
                    list.add(homeNum);
                    homeNum = 1;
                }
            }
        }

        Collections.sort(list);

        System.out.println(count);
        for (int a : list) {
            System.out.println(a);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int k = 0; k < pos.length; k++) {
            int nX = x + pos[k][0];
            int nY = y + pos[k][1];

            if (nX < 0 || nX > map.length - 1 || nY < 0 || nY > map[0].length - 1) {
                continue;
            }

            if (!visited[nX][nY] && map[nX][nY] == 1) {
                visited[nX][nY] = true;
                homeNum++;
                dfs(nX, nY);
            }
        }
    }
}
