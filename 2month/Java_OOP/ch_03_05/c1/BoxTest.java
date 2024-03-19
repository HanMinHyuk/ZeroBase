package ch_03_05.c1;

public class BoxTest {
    public static void main(String[] args) {

        Box b1 = new Box();
        b1.setBox("홍길동");
        String name = (String)b1.getBox();
        System.out.println(name);

        Box b2 = new Box();
        b2.setBox(25);
        Integer age = (Integer)b2.getBox();
        System.out.println(age);

        Integer count = (Integer)b1.getBox();
        System.out.println(count);

    }
}
