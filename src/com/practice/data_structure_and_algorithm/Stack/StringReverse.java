package com.practice.data_structure_and_algorithm.Stack;

import java.util.Stack;

public class StringReverse {
    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(char n : chars)
            stack.push(n);
        for(int i = 0; i<chars.length; i++)
            chars[i] = stack.pop();
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println("Before reversing the string: " + str);
        System.out.println("After reversing the string: " + StringReverse.reverse(str));



    }
}
