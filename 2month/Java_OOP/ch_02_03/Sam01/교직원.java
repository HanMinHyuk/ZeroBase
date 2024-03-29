package ch_02_03.Sam01;

public class 교직원 extends 사람 {
    public String 학교명;
    public long 번호; // 사원번호 (학교의 교직원번호)

    public 교직원() {}

    public 교직원(String 이름, long 번호, String 학교명, long 교원번호) {
        super(이름, 번호);
        this.학교명 = 학교명;
        this.번호 = 교원번호;

    }

    public long  get교직원번호() {
        return 번호;
    }

    // 오버라이딩
    @Override // annotation (표시)
    public void 정보출력() {
        System.out.println("[교직원정보]==============");
        System.out.println("이름: " + 이름);
        System.out.println("주민번호: " + super.번호);
        System.out.println("학교명: " + 학교명);
        System.out.println("교직원번호: " + 번호);
    }

}
