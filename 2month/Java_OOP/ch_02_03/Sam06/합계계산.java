package ch_02_03.Sam06;

public class 합계계산 {

    // 오버로딩 -> 클래스 내부에서 인자가 다르나 이름이 같은 메소드가 여러개 정의 (반환값은 다를 수 있으나, 인자가 같을 수는 없음)
    public int 더하기(int 값1, int 값2) {
        return 값1 + 값2;
    }

    public int 더하기(int 값1, int 값2, int 값3) {
        return 값1 + 값2 + 값3;
    }

    public int 더하기(int[] 값, int 값개수) {
        int sum = 0;
        for (int i = 0; i < 값개수; i++) {
            sum += 값[i];
        }
        return sum;
    }

}
