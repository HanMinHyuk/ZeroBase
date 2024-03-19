package ch_02_05.Sam08;

public class 삼성리모콘 implements 리모콘 {

    public void 음악듣기() {
        System.out.println("음악을 들려줍니다.");
    }

    @Override
    public void 전원켜기() {
        System.out.println("삼성티비의 전원을 켭니다.");
    }

    @Override
    public void 전원끄기() {
        System.out.println("삼성티비의 전원을 끕니다.");
    }

}
