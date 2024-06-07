package com.practice.data_structure_and_algorithm.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {3,2,4,7,10,6,5,18,13};

        removeEvenIntegers(numbers);
        //reverseArray(numbers);
        //findMinValue(numbers);
        //findMaxValue(numbers);
        //findSecondMaxValue(numbers);

        int[] numbers2 = {8,1,0,2,0,1,3,4,0,0,6};
        //moveZerosToEnd(numbers2);

        int[] numb = {4,2,1,8};
        //Scanner sc = new Scanner(System.in);
        //int size =sc.nextInt();
        //reSizeArray(numb,size);

        int[] numb2 = {1,2,3,4,5,6,7,8,10};
        findMissingNumber(numb2);

        //System.out.println(isPalindrome("madam"));



    }
    static void removeEvenIntegers(int[] array){
        int oddCount = 0;
        for(int k : array){
            if (k%2 != 0)
                oddCount++;
        }

        int [] result = new int[oddCount];

        for(int i = 0, j = 0; i < array.length; i++){
            if(array[i] % 2 != 0) {
                result[j]=array[i];
                j++;
            }
        }

        for(int n: result)
            System.out.print(n + " ");
    }
    static void reverseArray(int[] array){
        int n = array.length-1;
        int[] result = new int[array.length];

        for(int i = n, j = 0 ; i >= 0; i--, j++){
            result[j] = array[i];
        }
        for(int numb : result)
            System.out.print(numb + " ");


        // Or Another way is using while loop and swapping values

        int start = 0;
        int end = array.length-1;
        int temp;

        while (start < end){
            temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            start++;
            end--;
        }
        System.out.println();
        for(int numb : array)
            System.out.print(numb + " ");
    }
    static void findMinValue(int[] array){
        int min = array[0];
        for(int i = 0; i <array.length; i++){
            if(array[i] < min)
                min = array[i];
        }
        System.out.println("The minimum value in the array is: " + min);
    }
    static void findMaxValue(int[] array){
        int max = array[0];
        for(int n : array){
            if (max < n)
                max = n;
        }
        System.out.println("The maximum value in te array is: " + max);
    }
    static void findSecondMaxValue(int[] array){
       int max = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;
       for(int i = 0; i <array.length; i++){
          if(array[i] > max){
              secondMax = max;
              max = array[i];
          } else if (array[i] > secondMax && array[i] != max)
              secondMax = array[i];
       }
        System.out.println("The second max value is: " + secondMax);
    }
    static void moveZerosToEnd(int[] array){
        int j = 0;
        int temp;
        for(int i = 0; i <array.length; i++){
            if(array[i] != 0 && array[j] == 0){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if(array[j] != 0)
                j++;
        }
        for(int n : array)
            System.out.print(n + " ");
    }
    static void reSizeArray(int[] array, int newSize){
        int[] temp = new int[newSize];
        for(int i = 0; i <array.length; i++){
            temp[i] = array[i];
        }
        array = temp;

        for(int n: array)
            System.out.print(n + " ");
    }
    static void findMissingNumber(int[] array){
        int n = array.length + 1;
        int sum = (n*(n+1))/2;
        System.out.println(sum);
        for(int i = 0; i < array.length; i++){
            sum = sum - array[i];
        }
        System.out.println(sum);
    }
    static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end =charArray.length-1;

        for(int i = 0; i <charArray.length; i++){
            while (start < end) {
                if (charArray[start] != charArray[end])
                    return false;
                start++;
                end--;
            }
        }
        return true;
    }




















}
