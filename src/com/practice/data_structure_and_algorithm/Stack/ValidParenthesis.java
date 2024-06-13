package com.practice.data_structure_and_algorithm.Stack;

/*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.


    Example 1:

    Input: s = "()"
    Output: true
    Example 2:

    Input: s = "()[]{}"
    Output: true
    Example 3:

    Input: s = "(]"
    Output: false
 */

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

        String s = "()[]{}";
        boolean result = isValid(s);
        System.out.println(result);

    }


    public static boolean isValid(String s) {
        // if(s.length() == 1){
        //     return false;
        // }
        Stack<Character> stack = new Stack<>();
        boolean result = false;


        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return result;
                }

                char temp = stack.pop();

                if( c == ')' && temp != '(' || c == ']' && temp != '[' || c == '}' && temp != '{'){
                    return result;
                }
            }
        }

        return stack.isEmpty();


//        if(stack.isEmpty()){
//            return true;
//        }else{
//            return false;
//        }

    }
}
