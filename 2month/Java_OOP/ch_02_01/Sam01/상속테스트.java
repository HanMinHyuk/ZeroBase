package ch_02_01.Sam01;

public class 상속테스트 {
    public static void main(String[] args) {

        사람 사람1 = new 사람();
        사람1.이름 = "박하은";

        System.out.println("사람 이름: " + 사람1.이름);

        교직원 교직원1  = new 교직원();
        교직원1.이름 = "박하영";

        System.out.println("교직원 이름: " + 교직원1.이름);
    }
}
