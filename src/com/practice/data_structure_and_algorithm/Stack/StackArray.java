package com.practice.data_structure_and_algorithm.Stack;

import java.util.Arrays;
import java.util.Stack;

public class StackArray {
    private int top;
    private int[] array;

    public StackArray(){
        this(10);
    }
    public StackArray(int capacity) {
        top = -1;
        array = new int[capacity];
    }
    public boolean isFull(){
        return array.length == size();
    }
    public boolean isEmpty(){
        return top < 0;
    }
    public int size(){
        return top + 1;
    }
    public void push(int data){
        if(isFull())
            throw new RuntimeException("Stack if filled Up");
        top++;
        array[top] = data;
    }
    public int pop(){
        if(isEmpty())
            throw new RuntimeException("Stack is empty");
        int result = array[top];
        top--;
        return result;
    }
    public int peek(){
        if(isEmpty())
            throw new RuntimeException("No element available");
        return array[top];
    }
    public void displayAllArrayElement(){
        for(int n : array)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(4);
        stackArray.push(8);
        stackArray.push(4);
        stackArray.push(9);
        stackArray.push(2);
        stackArray.displayAllArrayElement();
        System.out.println(stackArray.peek());

        String str = "Decagon";
        char[] chars = str.toCharArray();

        Stack<Character> stack = new Stack<>();
        for(char c : chars){
            stack.push(c);
        }
        for(int i = 0; i < chars.length; i++){
            char temp = stack.pop();
            chars[i] = temp;
        }

        System.out.println(new String(chars));

    }
}
