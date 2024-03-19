package ch_02_02.Sam05;

public class 과일테스트 {

    public static void 과일확인(과일 과일체크) {

        if (과일체크 instanceof 바나나) {
            System.out.println("바나나 입니다.");
        } else if (과일체크 instanceof 배) {
            System.out.println("배 입니다.");
        } else if (과일체크 instanceof 사과) {
            System.out.println("사과 입니다.");
        } else {
            System.out.println("바나나, 배, 사과가 아닙니다.");
        }

    }


    public static void main(String[] args) {

        과일 과일1 = new 과일();
        과일 과일2 = new 바나나();  // 업캐스팅
        과일 과일3 = new 배();     // 업캐스팅
        과일 과일4 = new 사과();   // 업캐스팅

        과일[] 과일리스트 = {과일1, 과일2, 과일3, 과일4};

        for (int i = 0; i < 과일리스트.length; i++) {
            과일확인(과일리스트[i]);
        }

        /*
        생선 생선1 = new 생선();
        if (생선1 instanceof 과일) { // 애초에 생선은 과일과 관련이 없기 때문에 불가능 (상속 관계에 있을 때만 instanceof 사용 가능)
            System.out.println("과일 입니다.");
        } else {
            System.out.println("과일이 아닙니다.");
        }
        */


    }
}
