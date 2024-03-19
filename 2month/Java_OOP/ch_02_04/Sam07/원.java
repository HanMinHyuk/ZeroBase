package ch_02_04.Sam07;

public class 원 extends 도형 {
    int 반지름;

    public 원(int x좌표값, int y좌표값, int 반지름) {
        super(x좌표값, y좌표값);
        this.반지름 = 반지름;
    }

    @Override
    public void 그리기() {
        System.out.println("[원그리기]=========");
        System.out.println("좌표값: (" + x좌표값 + ", " + y좌표값 + ")");
        System.out.println("반지름: " + 반지름);

    }

}
