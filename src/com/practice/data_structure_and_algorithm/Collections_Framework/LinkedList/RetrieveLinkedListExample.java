package com.practice.data_structure_and_algorithm.Collections_Framework.LinkedList;

import java.util.LinkedList;

public class RetrieveLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        // getting first element in a Linked list
        String firstElement = fruits.getFirst();
        System.out.println(firstElement);

        //getting last element
        String lastElement = fruits.getLast();
        System.out.println(lastElement);

        //getting element at a given position
        String element = fruits.get(2);
        System.out.println(element);

        //retrieve all the elements in a linked list
        for(String str: fruits)
            System.out.print(str + " ");























    }
}
