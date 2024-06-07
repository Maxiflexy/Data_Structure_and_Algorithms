package com.practice.data_structure_and_algorithm.Collections_Framework.ArrayList.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(10);
//        list.add(40);
//        list.add(20);
//        list.add(60);
//        list.add(30);
//
//        Collections.sort(list); // ascending order
//        System.out.println(list);
//
//        Collections.reverse(list); // descending order
//        System.out.println(list);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Maxi", 28, 40_000));
        employees.add(new Employee(20, "Ifeoma", 30, 80_000));
        employees.add(new Employee(30, "Doris", 18, 90_000));
        employees.add(new Employee(40, "Onyeka", 24, 65_000));

        //Collections.sort(employees, new MySort()); // ascending order
        //System.out.println(employees);
        // to sort in descending order then we go to MySort class and change o1- o2 to o2 - o1





        // using an anonymous implementation of the comparator interface
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary() - o2.getSalary());
//            }
//        });
        //System.out.println(employees);// this will sort in ascending order; then to sort in descending order just swap the o1-o2 to o2-o1;


        // using a lambda expression;
        //Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary())); // ascending order sort


        // sorting the names instead of salary using anonymous inner class
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getName().compareTo(o2.getName()));
            }
        });
        //System.out.println(employees); // ascending order; to change to descending order just change o1 to o2 and o2 to o1;

        Collections.sort(employees,((o1, o2) -> (o1.getName().compareTo(o2.getName()))));
        System.out.println(employees);

    }
}

