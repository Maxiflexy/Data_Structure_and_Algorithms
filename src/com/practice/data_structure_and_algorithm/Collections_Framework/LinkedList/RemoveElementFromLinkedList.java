package com.practice.data_structure_and_algorithm.Collections_Framework.LinkedList;

import java.util.LinkedList;

public class RemoveElementFromLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruitList = new LinkedList<>();
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Orange");
        System.out.println(fruitList);

        //Remove the first element from the list
        String element = fruitList.removeFirst();
        System.out.println(fruitList);

        //Remove last element of a linked list
        String element2 = fruitList.removeLast();
        System.out.println(fruitList);

        //Remove a specified object in a list
        fruitList.remove("Apple");
        System.out.println(fruitList);

        // Remove all elements in the list
        fruitList.clear();
        System.out.println(fruitList);



    }
}
