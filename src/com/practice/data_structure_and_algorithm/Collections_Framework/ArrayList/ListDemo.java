package com.practice.data_structure_and_algorithm.Collections_Framework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // List allows us to add duplicate elements
//        list.add("element1");
//        list.add("element1");
//        list.add("element2");
//        list.add("element1");
//        System.out.println(list);
//
//        // List allows us to have 'null' elements
//        list.add(null);
//        list.add(null);
//        System.out.println(list);

        // insertion order
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        list.add("element5");
        System.out.println(list);


        // how to access element from the list
        System.out.println(list.get(2));
        System.out.println(list.get(0));










    }
}
