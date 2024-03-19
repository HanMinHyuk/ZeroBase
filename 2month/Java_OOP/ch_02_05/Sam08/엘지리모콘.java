package ch_02_05.Sam08;

public class 엘지리모콘 implements 리모콘, 전화기능 {

    @Override
    public void 전원켜기() {
        System.out.println("엘지티비의 전원을 켭니다.");
    }

    @Override
    public void 전원끄기() {
        System.out.println("엘지티비의 전원을 끕니다.");
    }

    @Override
    public void 전화받기() {
        System.out.println("전화를 받습니다.");
    }
}
