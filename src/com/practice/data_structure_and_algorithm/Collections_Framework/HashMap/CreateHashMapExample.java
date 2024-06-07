package com.practice.data_structure_and_algorithm.Collections_Framework.HashMap;

import java.util.*;

public class CreateHashMapExample {
    public static void main(String[] args) {




        // example to map numbers(values)  to string(key)
        Map<String, Integer> numberMapping = new HashMap<>();

        //add key-value to map
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);
        numberMapping.put("Four", 4);
        numberMapping.put("Five", 5);
        numberMapping.put(null, 6);
        numberMapping.put(null, 6); //  cant duplicate

        System.out.println(numberMapping);


        // check if HashMap is empty
        System.out.println(numberMapping.isEmpty());

        // find the size of HashMap
        System.out.println(numberMapping.size());

        // check if a key exist in a HashMap
        if(numberMapping.containsKey("Four"))
            System.out.println("Exist");
        else
            System.out.println("Not exist");

        // check if a value exist in a HashMap
        if(numberMapping.containsValue(4))
            System.out.println("Number found");
        else
            System.out.println("Not Found");

        // get value by using key
        int v1 = numberMapping.get("Five");
        System.out.println(v1);

        // how to remove keys from HashMap
        numberMapping.remove("One");
        System.out.println(numberMapping);

        // get only keys from HashMap
        Set<String> keySet = numberMapping.keySet();
        System.out.println(keySet);

        // get only values from HashMap
        Collection<Integer> values = numberMapping.values();
        System.out.println(values);

        for(Map.Entry<String, Integer> entry : numberMapping.entrySet()){
            System.out.println(entry);
            entry.getValue();
        }

    }




}
