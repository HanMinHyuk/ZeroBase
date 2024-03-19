package ch_03_05.c2;

public class Box2<T> {

    private T name;
    private T gender;

    public void setData(T name, T gender) {
        this.name = name;
        this.gender = gender;
    }

    public T getName() {
        return name;
    }

    public T getGender() {
        return gender;
    }

}
