package com.practice.data_structure_and_algorithm.Queue;

import java.util.Arrays;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<String> pq = new java.util.PriorityQueue<>();

        String str1 = "abbc";
        String str2 = "1234";
        String str3 = "9674";
        String str4 = "1121";
        String str5 = "abcd";
        String str6 = "maxi";
        String[] str = {str1, str2, str3, str4, str5, str6};

        pq.addAll(Arrays.asList(str));

        System.out.println(pq.poll() + '\n');

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
