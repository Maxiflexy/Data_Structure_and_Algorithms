package com.practice.data_structure_and_algorithm.Collections_Framework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AccessElementFromArrayListExample {
    public static void main(String[] args) {

        List<String> topProgrammingLanguages = new ArrayList<>();

        // check if arraylist is empty
        System.out.println(topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("C");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add(".NET");

        // Find the size of an arrayList
        System.out.println(topProgrammingLanguages.size());

        // Retrieve element at a given index
        String bestLang = topProgrammingLanguages.get(1);
        System.out.println(bestLang);

        // Modify the element at a given index
        topProgrammingLanguages.set(4, "C#");
    }



}
