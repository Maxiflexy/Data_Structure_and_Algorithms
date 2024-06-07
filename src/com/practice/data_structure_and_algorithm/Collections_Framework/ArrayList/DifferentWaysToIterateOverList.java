package com.practice.data_structure_and_algorithm.Collections_Framework.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverList {
    public static void main(String[] args) {

        List<String> courses = Arrays.asList("C", "Java", "Spring", " Hibernate");
        //basic for loop
        for(int i = 0; i < courses.size(); i++)
            System.out.print(courses.get(i) + " ");

        System.out.println();

        // Enhanced for each loop
        for(String s : courses)
            System.out.print(s + " ");

        System.out.println();

        // basic loop with iterator
        for(Iterator<String> iterator = courses.iterator(); iterator.hasNext();){
            String course = (String) iterator.next();
            System.out.print(course + " ");
        }

        System.out.println();
        // iterator with while loop
        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()){
            String course = (String) iterator.next();
            System.out.print(course + " ");
        }


        // using java 8 stream + lambda example
        courses.stream().forEach(course -> System.out.print(course + " "));

        // java 8 forEach + lambda
        courses.forEach((course) -> System.out.print(course + " "));




    }
}
