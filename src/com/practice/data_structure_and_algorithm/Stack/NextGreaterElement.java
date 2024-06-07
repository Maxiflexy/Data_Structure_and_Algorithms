package com.practice.data_structure_and_algorithm.Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] array){
        int[] result = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        for(int i =array.length-1; i >= 0; i--){
            if(!stack.isEmpty()){
                while (!stack.isEmpty() && array[i] >= stack.peek())
                    stack.pop();
            }
            if(stack.isEmpty())
                result[i] = -1;
            else
                result[i] = stack.peek();
            stack.push(array[i]);
        }
        return result;
    }

    public static boolean isValidParentheses(String str){
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else {
                if(stack.isEmpty())
                    return false;
                else {
                    char top = stack.peek();
                    if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')){
                       stack.pop();
                    }
                    else
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // if there is any greater value it will replace the value else it will replace with -1,
        int[] array = {4,7,3,1,2,6,9,4,8,0,1,1};
        int[] result = NextGreaterElement.nextGreaterElement(array);
        for(int n : result)
            System.out.print(n + " ");
        System.out.println();
        // if the parentheses are arranged according
        String str = "{()}";
        System.out.println(NextGreaterElement.isValidParentheses(str));
    }
}
