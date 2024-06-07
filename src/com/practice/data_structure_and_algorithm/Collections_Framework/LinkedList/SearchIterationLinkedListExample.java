package com.practice.data_structure_and_algorithm.Collections_Framework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class SearchIterationLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> progLangs = new LinkedList<>();
        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("Core Java");
        progLangs.add("Java EE");
        progLangs.add("Spring Framework");
        progLangs.add("Spring Framework");
        progLangs.add("Hibernate Framework");

        //returns a boolean if a method contains the element or not;
        System.out.println(progLangs.contains("C"));

        //Find the index of the first occurrence of an element in the LinkedList;
        int index = progLangs.indexOf("Core Java");
        System.out.println(index);

        //Find the index of the last occurrence of an element in the LinkedList;
        // it shows the last index the element appeared in the list
        int lastIndex = progLangs.lastIndexOf("Spring Framework");
        System.out.println(lastIndex);



        // to iterate over a LinkedList we can use the following:
        // Iterator, forEach method, for each advanced loop, simple for loop;

        //iterator
        Iterator<String> iterator = progLangs.iterator();
        while (iterator.hasNext()){
            String progs = (String) iterator.next();
            System.out.println(progs);
        }

        // for Each method
        progLangs.forEach((element) -> {
            System.out.println(element);
        });

        // for each loop
        for(String element : progLangs)
            System.out.println(element);


        //simple for loop;
        for(int i = 0; i < progLangs.size(); i++){
            String element = progLangs.get(i);
            System.out.print(element + " ");
        }

        /*
        Difference between ArrayList and LinkedList
        1. ArrayList internally uses a dynamic array to store the elements; while
         LinkedList internally uses a doubly linked list to store element

        2. ArrayList manipulation is slow; LinkedList manipulation is faster;

        3. Arraylist consumes less memory; LinkedList consumes more memory because it stores the next and previous
        references along with the data

        4. ArrayList class can act as a list only because it implements List only; while LinkedList
        acts as a list and queue because it implements List and Deque Interface.

        5. ArrayList is better for storing and accessing data; while LinkedList is better for manipulating
        data.






         */









    }
}
