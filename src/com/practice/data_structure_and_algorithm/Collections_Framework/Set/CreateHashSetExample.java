package com.practice.data_structure_and_algorithm.Collections_Framework.Set;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
    public static void main(String[] args) {
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Scala");
        programmingLanguages.add("JavaScript");
        System.out.println(programmingLanguages);

        // lets add duplicate element
        programmingLanguages.add("Java");
        System.out.println(programmingLanguages); // it will nor duplicate


    }
}
