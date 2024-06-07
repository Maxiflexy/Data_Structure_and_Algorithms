package com.practice.data_structure_and_algorithm.LinkedList.SinglyLinkedList;



public class PracticeSinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        PracticeSinglyLinkedList obj = new PracticeSinglyLinkedList();

        ListNode head = new ListNode(6);
        ListNode second = new ListNode(9);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(3);
        ListNode five = new ListNode(12);


        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;


        //System.out.println(obj.lengthOfList());

        obj.display2(head);

        ListNode result = obj.reverseList(head);

        //obj.display2(result);




        PracticeSinglyLinkedList obj2 = new PracticeSinglyLinkedList();
        //obj2.insertFirst(4);
        obj2.insertLast(9);
        obj2.insertLast(3);
        obj2.insertLast(13);
        obj2.insertLast(2);
        obj2.insertLast(31);
        obj2.insertAtPosition(8,1);
        obj2.insertAtPosition(7,4);
        //System.out.println(obj2.deleteFirst().data);
        //obj2.deleteFirst();
        obj2.display();
        //System.out.println(obj2.containsElement(13));
        //obj2.removeAtPosition(5);
        //obj2.reverseList();
        //obj2.display();
        //obj2.display();
        ListNode result2 = obj2.middleNode();
        //System.out.println(result2.data);

        //System.out.println(obj2.deleteLast().data);
        //obj2.display();
        //System.out.println("The length of List: " + obj2.lengthOfList());
    }
    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void display2(ListNode object){
        ListNode current = object;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public int lengthOfList(){
        if(head == null)
            return 0;
        int count = 0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void insertFirst(int data) {
        ListNode newNode=new ListNode(data);
        newNode.next=head;
        head=newNode;
    }

    public void insertLast(int data){
        ListNode newNode = new ListNode(data);
        if(head == null) {
            head=newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void insertAtPosition(int data, int position){
        ListNode newNode = new ListNode(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
        }
        else {
            ListNode previous=head;
            int count=1;
            while (count<position - 1) {
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=newNode;
            newNode.next=current;
        }
    }
    public ListNode deleteFirst(){
        if(head == null)
            return null;
        ListNode temp = head;
        head = temp.next;
        temp.next = null;
        return temp;
    }
    public ListNode deleteLast(){
        if(head == null || head.next == null)
            return head;
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }
    public void removeAtPosition(int position){
        if(position == 1)
            head = head.next;
        else {
            int count = 1;
            ListNode previous = head;
            while (count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;

        }



    }
    public boolean containsElement(int searchKey){
        ListNode current = head;
        while (current != null){
            if(current.data == searchKey)
                return true;
            else
                current = current.next;
        }
        return false;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }
    public ListNode middleNode(){
        if(head == null)
            return null;

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

}
