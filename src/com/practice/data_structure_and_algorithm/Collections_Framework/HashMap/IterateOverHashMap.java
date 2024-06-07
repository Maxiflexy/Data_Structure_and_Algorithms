package com.practice.data_structure_and_algorithm.Collections_Framework.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateOverHashMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        numbers.put("Six", 6);

        // for each method
        for(Map.Entry<String, Integer> entry : numbers.entrySet())
            System.out.println("Key ->" + entry.getKey() + ",   Value -> " + entry.getValue()) ;

        // using iterator
        Set<Map.Entry<String, Integer>> entries = numbers.entrySet();
        Iterator<Map.Entry<String , Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("key : " + entry.getKey() + "    value: " + entry.getValue());
        }


        // using Java * forEach method
        numbers.forEach((K, V) -> {
            System.out.print(" K " + K);
            System.out.println(" V " + V);
        });




    }
}
