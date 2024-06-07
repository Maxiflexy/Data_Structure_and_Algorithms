package com.practice.data_structure_and_algorithm.LinkedList.Circular_SinglyLinkedList;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;
        public ListNode(int data){
            this.data = data;
        }
    }
    public CircularSinglyLinkedList(){
        last = null;
        length = 0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void createCircularLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(16);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }
    public void display(){
        if(last == null) return;
        ListNode temp = last.next;
        while(temp != last){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(last.data);
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList obj = new CircularSinglyLinkedList();
        obj.createCircularLinkedList();
        obj.display();
        obj.insertListNodeAtStart(4);
        obj.display();
        obj.insertListNodeAtEnd(5);
        obj.display();
        ListNode result = obj.removeFirstNode();
        obj.display();
        System.out.println(result.data);
    }

    public void insertListNodeAtStart(int data){
        ListNode temp = new ListNode(data);
        if(last == null)
            last = temp;
        else
            temp.next = last.next;
        last.next = temp;
        length++;
    }
    public void insertListNodeAtEnd(int data){
        ListNode temp = new ListNode(data);
        ListNode previous = last;
        if(last == null) {
            last=temp;
            last.next = last;
        }
        else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }
    public ListNode removeFirstNode(){
        if(last == null)
            throw new NoSuchElementException("Circular Singly List is already empty");

        ListNode temp = last.next;
        if(last.next == last){
            last = null;
        }
        else{
            last.next = temp.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

}
