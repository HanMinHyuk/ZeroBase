package ch_02_01.Sam02;

public class 자동차 extends 차량 {
    public String 이름 = "자동차";
    public String 배기량;

    public 자동차() {
        // super(); // 부모 클래스의 생성자 호출
        System.out.println("자동차의 생성자 호출!");
        // 차량의 생성자도 호출!
    }

    public 자동차(double 최대속도, int 정원, String 배기량) {
        super(최대속도, 정원); // 부모 클래스의 생성자 호출
        // super.최대속도 = 최대속도;
        // super.정원 = 정원;
        this.배기량 = 배기량;
        System.out.println("자동차의 매개변수를 받는 생성자(최대속도, 정원, 배기량) 호출!");

    }

    public void 정보출력() {
        System.out.println("(차량)이름: " + super.이름); // 부모클래스의 필드를 가지고 오고 싶을 때 super 사용
        System.out.println("최대속도: " + 최대속도);
        System.out.println("정원: " + 정원);

        System.out.println("배기량: " + 배기량);
        System.out.println("(자동차)이름: " + this.이름); // 자기 자신의 필드를 가지고 오고 싶을 때 this 사용
    }

}
