package com.practice.data_structure_and_algorithm.Collections_Framework.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverSet {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("C");
        courses.add("C++");
        courses.add("Python");
        courses.add("Scala");

        // enhanced for loop
        for(String course : courses)
            System.out.print(course + "  ");

        System.out.println();
        // basic loop with iterator
        for(Iterator<String > iterator = courses.iterator(); iterator.hasNext();){
            String course = (String) iterator.next();
            System.out.print(course + "  ");
        }

        System.out.println();
        //while loop with iterator
        Iterator<String > iterator = courses.iterator();
        while (iterator.hasNext()){
            String course = (String) iterator.next();
            System.out.print(course + " ");
        }


        System.out.println();
        // JDK 8 forEach() method with lambda
        courses.forEach( course -> System.out.println(course + " "));

        //Java 8 Streaming + lambda expression
        courses.stream().filter(course -> !"Java".equals(course)).forEach(course -> System.out.print(course + " "));












    }
}
