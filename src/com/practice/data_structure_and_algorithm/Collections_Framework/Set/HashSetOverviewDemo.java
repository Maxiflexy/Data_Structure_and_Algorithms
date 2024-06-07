package com.practice.data_structure_and_algorithm.Collections_Framework.Set;

import java.util.Set;
import java.util.HashSet;

public class HashSetOverviewDemo {
    /*
    1. HashSet cannot contain duplicate values
    2. HashSet allows null value
    3. HashSet is an unordered collection. It does not maintain the order in which the elements are added.
        It automatically sorts the elements in ascending order.
    4. HashSet internally uses a HashMap to store its element.
    5. HashSet is not thread-safe. If multiple threads try to modify a HashSet at the same time,
        then the final outcome is non-deterministic. You must explicitly synchronize concurrent
        access to a HashSet in a multi-thread environment.
     */

    public static void main(String[] args) {
        // it does not contain duplicate elements
        Set<String> set = new HashSet<>();
        set.add("element1");
        set.add("element1");
        set.add("element1");
        System.out.println(set.toString()); // displays only one element1;


        // it is unordered collection
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(5);
        integers.add(8);
        integers.add(2);
        integers.add(4);
        integers.add(7);
        integers.add(3);
        integers.add(6);
        System.out.println(integers); // its prints the numbers in ascending order














    }
}
