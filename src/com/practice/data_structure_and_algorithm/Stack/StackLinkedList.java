package com.practice.data_structure_and_algorithm.Stack;

import java.util.EmptyStackException;

public class StackLinkedList {
    private ListNode top;
    private int length;

    public class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }
    public StackLinkedList(){
        top = null;
        length = 0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }
    public int pop(){
        if(top == null)
            throw new EmptyStackException();
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    public int peek(){
        if(top == null)
            throw new EmptyStackException();
        return top.data;
    }


    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(8);
        stack.push(4);
        stack.push(9);
        stack.push(12);

        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
    }



}
