package com.practice.data_structure_and_algorithm.Collections_Framework.ArrayList.Sorting;

import java.util.Comparator;

public class MySort implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2){
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
