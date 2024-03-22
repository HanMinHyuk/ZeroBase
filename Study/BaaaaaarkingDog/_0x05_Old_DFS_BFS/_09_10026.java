package _0x05_Old_DFS_BFS;
// 적록색약
import java.io.*;

public class _09_10026 {
    static String[][] map1;
    static String[][] map2;
    static boolean[][] visited1;
    static boolean[][] visited2;
    static int[] RGB1;
    static int[] RGB2;
    static int[][] pos = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        map1 = new String[N][N];
        map2 = new String[N][N];
        visited1 = new boolean[N][N];
        visited2 = new boolean[N][N];
        RGB1 = new int[3];
        RGB2 = new int[2];

        for (int i = 0; i < N; i++) {
            String[] strArr = br.readLine().split("");
            for (int j = 0; j < strArr.length; j++) {
                map1[i][j] = strArr[j];
                if ("G".equals(strArr[j])) {
                    map2[i][j] = "R";
                } else {
                    map2[i][j] = strArr[j];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                String str = map1[i][j];
                if (!visited1[i][j]) {
                    switch (str) {
                        case "R":
                            RGB1[0]++;
                            dfs1(i, j);
                            break;
                        case "G":
                            RGB1[1]++;
                            dfs1(i, j);
                            break;
                        case "B":
                            RGB1[2]++;
                            dfs1(i, j);
                            break;
                    }
                }

                if (!visited2[i][j]) {
                    switch (str) {
                        case "R": case "G":
                            RGB2[0]++;
                            dfs2(i, j);
                            break;
                        case "B":
                            RGB2[1]++;
                            dfs2(i, j);
                            break;
                    }
                }
            }
        }

        int person1 = 0;
        int person2 = 0;
        for (int a : RGB1) {
            person1 += a;
        }
        for (int b : RGB2) {
            person2 += b;
        }

        System.out.print(person1 + " " + person2);
    }

    public static void dfs1(int x, int y) {
        visited1[x][y] = true;

        for (int i = 0; i < pos.length; i++) {
            int nX = x + pos[i][0];
            int nY = y + pos[i][1];

            if (nX < 0 || nX > map1.length - 1 || nY < 0 || nY > map1[0].length - 1) {
                continue;
            }

            if (!visited1[nX][nY] && map1[x][y].equals(map1[nX][nY])) {
                visited1[nX][nY] = true;
                dfs1(nX, nY);
            }
        }
    }

    public static void dfs2(int x, int y) {
        visited2[x][y] = true;

        for (int i = 0; i < pos.length; i++) {
            int nX = x + pos[i][0];
            int nY = y + pos[i][1];

            if (nX < 0 || nX > map2.length - 1 || nY < 0 || nY > map2[0].length - 1) {
                continue;
            }

            if (!visited2[nX][nY] && map2[x][y].equals(map2[nX][nY])) {
                visited2[nX][nY] = true;
                dfs2(nX, nY);
            }
        }
    }
}
