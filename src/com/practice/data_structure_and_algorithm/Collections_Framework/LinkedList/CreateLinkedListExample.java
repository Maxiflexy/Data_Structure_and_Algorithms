package com.practice.data_structure_and_algorithm.Collections_Framework.LinkedList;

import java.util.LinkedList;

public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits);

        //Adding an element at the specified position
        fruits.add(2, "Watermelon");
        System.out.println(fruits);


        //Add an element at the beginning of the linkedList
        fruits.addFirst("Strawberry");
        System.out.println(fruits);


        //add an element at the end of a list
        fruits.addLast("Pineapple");
        System.out.println(fruits);


    }
}
