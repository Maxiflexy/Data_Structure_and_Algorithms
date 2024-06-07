package com.practice.data_structure_and_algorithm.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int[] arr = {13,34,14,34,33,1,7,39,34,4,123};
        int[] arr1 = {8,1,0,2,1,0,3};

        int j = 0;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != 0 && arr1[j] == 0){
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
            }
            if( arr1[j] != 0)
                j++;
        }

        System.out.println(Arrays.toString(arr1));

        int target = 18;

        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));

        System.out.println(findSecondMax(arr));


    }
    public static int[] twoSum(int[] numbers, int target){
        int temp = 0;
        int index1 = 0;
        int index2 = 0;

        while (temp < numbers.length){
            int pointer = numbers[temp];
            for(int i = 0; i < numbers.length; i++){
                if(pointer + numbers[i] == target && temp != i){
                    index1 = temp;
                    index2 = i;
                }
            }
            temp++;
        }
        int[] result = {index2, index1};

        return result;
    }
    public static int findSecondMax(int[] array){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max){
                secondMax = array[i];
            }

        }
        return secondMax;

    }


}
