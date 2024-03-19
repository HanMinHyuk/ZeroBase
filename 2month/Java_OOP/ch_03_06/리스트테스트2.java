package ch_03_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class 리스트테스트2 {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("C");
        arrayList.add("A");

        for (String x : arrayList) {
            System.out.println(x);
        }

        System.out.println("------------");

        Collections.sort(arrayList);

        for (String x : arrayList) {
            System.out.println(x);
        }

    }

}
