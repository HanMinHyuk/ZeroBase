package ch_02_02.Sam02;

public class 차량테스트 {

    public static void main(String[] args) {
        차량 차량1 = new 차량();
        차량1.이름 = "차량";
        차량1.최대속도 = 100;
        차량1.정원 = 2;

        차량1.정보출력();
    }
}
