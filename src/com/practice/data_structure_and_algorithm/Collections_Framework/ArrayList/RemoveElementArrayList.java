package com.practice.data_structure_and_algorithm.Collections_Framework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Grapes");
        System.out.println(fruits);


        // Remove at index
        fruits.remove(4);
        System.out.println(fruits);

        // Remove with passing element parameter as an object;
        fruits.remove("Mango");
        System.out.println(fruits);

        // Remove all the elements that exist in a given collection by passing a collection object
        List<String> subFruitsList = new ArrayList<>();
        subFruitsList.add("Apple");
        subFruitsList.add("Banana");

        fruits.removeAll(subFruitsList);
        System.out.println(fruits);

        // Remove all the elements from the list
        fruits.clear();






    }
}
