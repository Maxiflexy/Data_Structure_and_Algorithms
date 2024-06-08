package com.practice.data_structure_and_algorithm.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Practice {
    public static void main(String[] args) {

        int n = 7;

        String[] result = generateBinaryNumbers(n);
        System.out.println(Arrays.toString(result));

    }


    public static String[] generateBinaryNumbers(int n){

        Queue<String> integerQueue = new LinkedList<>();

        String[] result = new String[n];
        integerQueue.add("1");
        for(int i = 0; i < n ; i++){
            result[i] = integerQueue.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";

            integerQueue.add(n1);
            integerQueue.add(n2);

        }

        return result;
    }

    public static void deQueue(){

    }


}
