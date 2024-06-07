package com.practice.data_structure_and_algorithm.Collections_Framework.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromCollectionExample {
    /*
    1. Create HashSet from another collection using the HashSet(Collection c) constructor.
    2. Add all the elements from a collection to the HashSet using the addAll() method.
    */
    public static void main(String[] args) {
        // first 5 even numbers
        List<Integer> firstFiveEvenNumbers = new ArrayList<>();
        firstFiveEvenNumbers.add(2);
        firstFiveEvenNumbers.add(4);
        firstFiveEvenNumbers.add(6);
        firstFiveEvenNumbers.add(8);
        firstFiveEvenNumbers.add(10);


        // create a HashSet from another collection using the HashSet(Collection c)
        Set<Integer> tenEvenNumbers = new HashSet<>(firstFiveEvenNumbers);
        System.out.println(tenEvenNumbers);


        List<Integer> nextFiveEvenNumbers = new ArrayList<>();
        nextFiveEvenNumbers.add(12);
        nextFiveEvenNumbers.add(14);
        nextFiveEvenNumbers.add(16);
        nextFiveEvenNumbers.add(18);
        nextFiveEvenNumbers.add(20);

        //Add all the elements from a collection to the HashSet using the addAll() method.
        tenEvenNumbers.addAll(nextFiveEvenNumbers);
        System.out.println(tenEvenNumbers);








    }
}
