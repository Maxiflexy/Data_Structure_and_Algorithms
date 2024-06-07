package com.practice.data_structure_and_algorithm.Collections_Framework.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {
    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student("Onyeka", "Maxi"));
        studentMap.put(2, new Student("Ifeoma", "Doris"));
        studentMap.put(3, new Student("Banke", "Abigail"));

        System.out.println(studentMap);
    }
}
