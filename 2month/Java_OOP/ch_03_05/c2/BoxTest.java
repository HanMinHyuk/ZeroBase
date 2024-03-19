package ch_03_05.c2;

public class BoxTest {
    public static void main(String[] args) {

        Box<String> b1 = new Box<String>();
        b1.setBox("홍길동");
        String name = b1.getBox();
        System.out.println(name);

        Box<Integer> b2 = new Box<Integer>();
        b2.setBox(25);
        Integer age = b2.getBox();
        System.out.println(age);


    }
}
