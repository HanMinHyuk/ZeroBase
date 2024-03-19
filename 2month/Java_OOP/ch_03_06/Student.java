package ch_03_06;

public class Student implements Comparable<Student> {

    private int no;
    private String name;

    public Student (int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("학번: %d, 이름: %s", no, name);
    }

    @Override
    public int compareTo(Student o) {
        return o.no - this.no;
    }
}
