package com.practice.data_structure_and_algorithm.LinkedList.Doubly_LinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;
    private class ListNode{
        private int data;
        private ListNode previous;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public int getLength(){
        return length;
    }
    public void displayForward(){
        if(head == null) return;
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void displayBackward(){
        if(tail == null) return;
        ListNode temp = tail;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }
    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty())
            tail = newNode;
        else
            head.previous = newNode;
        newNode.next = head;
        head = newNode;
        length++;
    }
    public void insertLast(int data) {
        ListNode newNode=new ListNode(data);
        if (isEmpty())
            head=newNode;
        else{
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail = newNode;
        length++;
    }
    public void deleteFirstNode(){
        if(isEmpty())
            throw new NoSuchElementException();
        ListNode temp = head;
        if(head == tail)
            tail = null;
        else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
    }
    public void deleteLastNode(){
        if(isEmpty())
            throw new NoSuchElementException();
        ListNode temp = tail;
        if(tail == head)
            head = null;
        else
            temp.previous.next = null;
        tail = tail.previous;
        tail.previous = null;
        length--;
    }

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        //obj.insertFirst(5);
        obj.displayForward();
        obj.insertLast(4);
        obj.insertLast(8);
        obj.insertLast(15);
        obj.displayForward();
        //obj.deleteFirstNode();
        obj.deleteLastNode();
        obj.displayForward();
    }
}
