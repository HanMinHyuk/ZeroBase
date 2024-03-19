package ch_03_06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 리스트테스트 {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("C");
        arrayList.add("A");

        linkedList.add("B");
        linkedList.add("A");
        linkedList.add("D");
        linkedList.add("C");
        linkedList.add("A");

        for (String x : arrayList) {
            System.out.println(x);
        }

        System.out.println("-------------");
        for (String x : linkedList) {
            System.out.println(x);
        }


    }
}
