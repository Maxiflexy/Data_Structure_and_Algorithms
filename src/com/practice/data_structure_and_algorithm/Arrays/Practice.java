package com.practice.data_structure_and_algorithm.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[] numbers1 = {3,2,8,4,7,10,26,6,5,18,13,77};
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));
        //removeEvenIntegers(numbers);
        //reverseArray(numbers);

//        List<Integer> newNum = new ArrayList<>();
//
//        for(int i = 0, j = 0; i < numbers.length; i++){
//            if(numbers[i] % 2 != 0) {
//                newNum.add(numbers[i]);
//                j++;
//            }
//        }
//
//        for(int n : newNum)
//            System.out.println(n + " ");

        int count = 0;
        for (int number : numbers1) {
            if (number % 2 != 0)
                count++;
        }
        //System.out.println(count);

        int[] num1 = new int[count];
        int i = 0;
        for(int n : numbers1){
            if(n % 2 != 0) {
                num1[i] = n;
                i++;
            }
        }

        for(int nn : num1)
            System.out.print(nn + " ");

    }
}
