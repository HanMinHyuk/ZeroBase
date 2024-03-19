package ch_03_06;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class 맵테스트 {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        hashMap.put("B", "B-value");
        hashMap.put("A", "A-value");
        hashMap.put("D", "D-value");
        hashMap.put("C", "C-value");
        hashMap.put("B", "BB-value");

        linkedHashMap.put("B", "B-value");
        linkedHashMap.put("A", "A-value");
        linkedHashMap.put("D", "D-value");
        linkedHashMap.put("C", "C-value");
        linkedHashMap.put("B", "BB-value");

        treeMap.put("B", "B-value");
        treeMap.put("A", "A-value");
        treeMap.put("D", "D-value");
        treeMap.put("C", "C-value");
        treeMap.put("B", "BB-value");


        for (String key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }

        System.out.println("-----------------");
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + " : " + linkedHashMap.get(key));
        }

        System.out.println("-----------------");
        for (String key : treeMap.keySet()) {
            System.out.println(key + " : " + treeMap.get(key));
        }

    }
}
