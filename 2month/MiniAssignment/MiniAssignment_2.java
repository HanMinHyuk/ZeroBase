/*
   한민혁
   2. 자신의 좌표값과 가장 가까운 좌표값 구하는 프로그램
*/


import java.util.*;
import java.io.*;

public class MiniAssignment_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("내 좌표 x값을 입력해 주세요.");
        int myX = Integer.parseInt(br.readLine());
        System.out.println("내 좌표 y값을 입력해 주세요.");
        int myY = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        double[] disArr = new double[10];
        int idx = 0;
        int cnt = 1;
        while (list.size() < 10) {
            System.out.println(cnt + "/10 번째 입력");
            System.out.println("임의의 좌표 x값을 입력해 주세요.");
            int ranX = Integer.parseInt(br.readLine());
            System.out.println("임의의 좌표 y값을 입력해 주세요.");
            int ranY = Integer.parseInt(br.readLine());

            if (list.contains(new ArrayList<>(Arrays.asList(ranX, ranY)))) {
                System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해 주세요.");
            } else {
                list.add(new ArrayList<>(Arrays.asList(ranX, ranY)));
                double dis = Math.sqrt(Math.pow(myX-ranX, 2) + Math.pow(myY - ranY, 2));
                disArr[idx] = dis;
                idx++;
                cnt++;
            }
        }

        int minIdx = 0;
        double min = disArr[0];
        for (int i = 0; i < disArr.length; i++) {
            System.out.printf("(%d, %d) => %.6f\n", list.get(i).get(0), list.get(i).get(1), disArr[i]);
            if (disArr[i] < min) {
                min = disArr[i];
                minIdx = i;
            }
        }
        System.out.println("제일 가까운 좌표:");
        System.out.printf("(%d, %d) => %.6f\n", list.get(minIdx).get(0), list.get(minIdx).get(1), disArr[minIdx]);
        System.out.println();
    }
}
