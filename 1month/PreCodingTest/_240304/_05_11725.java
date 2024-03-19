package _240304;
import java.util.*;
import java.io.*;
// 트리의 부모 찾기

public class _05_11725 {
//     내 풀이
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        if (N < 2) {
            return;
        }

        int[] result = new int[N];
        result[0] = 1;

        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (result[b-1] != 0) {
                result[a-1] = b;
            } else {
                result[b-1] = a;
            }
        }

        for (int i = 1; i < result.length; i++) {
            bw.write(result[i] + "\n");
        }
        bw.flush();
        bw.close();
    }*/

//     다른 사람의 풀이
    public static List<List<Integer>> adjList;
    public static int[] parents; // 부모 노드를 저장할 배열
    public static boolean[] visited; // 방문 여부를 확인할 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        adjList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        parents = new int[N + 1];
        visited = new boolean[N + 1];

        findParents(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }
    }

    public static void findParents(int currentNode) {
        visited[currentNode] = true;

        for (int adjacent : adjList.get(currentNode)) {
            if (!visited[adjacent]) {
                parents[adjacent] = currentNode;

                findParents(adjacent);
            }
        }
    }
}
