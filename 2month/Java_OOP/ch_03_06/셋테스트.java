package ch_03_06;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class 셋테스트 {

    public static void main(String[] args) {

        Set<String> hashset = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeset = new TreeSet<>();

        hashset.add("4");
        hashset.add("2");
        hashset.add("3");
        hashset.add("1");
        hashset.add("4");
        hashset.add("4");
        hashset.add("4");
        hashset.add("4");

        linkedHashSet.add("4");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add("1");
        linkedHashSet.add("4");

        treeset.add("4");
        treeset.add("2");
        treeset.add("3");
        treeset.add("1");
        treeset.add("4");


        Iterator<String> hashSetIterator = hashset.iterator();
        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }

        System.out.println("--------------");
        Iterator<String> linkedHashSetIterator = linkedHashSet.iterator();
        while (linkedHashSetIterator.hasNext()) {
            System.out.println(linkedHashSetIterator.next());
        }

        System.out.println("--------------");
        Iterator<String> treeSetIterator = treeset.iterator();
        while (treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
        }



    }
}
