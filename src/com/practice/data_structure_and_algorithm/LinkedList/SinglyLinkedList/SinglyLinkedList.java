package com.practice.data_structure_and_algorithm.LinkedList.SinglyLinkedList;

public class SinglyLinkedList {
    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(){
            this.data = 0;
            this.next = null;
        }
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }
    private ListNode head;

    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        SinglyLinkedList obj2 = new SinglyLinkedList();
        SinglyLinkedList testing = new SinglyLinkedList();

        obj2.head = new ListNode(1);
        ListNode second2 = new ListNode(1);
        ListNode third2 = new ListNode(2);
        ListNode forth2 = new ListNode(3);
        ListNode fifth2 = new ListNode(3);
        ListNode sixth2 = new ListNode(7);

        obj2.head.next = second2;
        second2.next = third2;
        third2.next = forth2;
        forth2.next = fifth2;
        fifth2.next = sixth2;


        obj2.display();
        obj2.removeDuplicate();
        obj2.display();
        ListNode newNode = new ListNode(5);
        obj2.insertDataToSortedList(newNode);
        obj2.display();



        System.out.println();
        System.out.println("/" + '\n'+ '\n'+ '\n'+ '\n' + "/");



        obj.head = new ListNode(4);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(10);

        obj.head.next = second;
        second.next = third;
        third.next = forth;

        obj.insertFirst(3);
        obj.insertFirst(2);

        //obj.insertLast(7);
        //obj.insertLast(5);
        //obj.display();

        //obj.insertDataAtPosition(12,5);
        //obj.display();
        //obj.deleteFirst();
        //obj.display();
        //obj.removeAtPosition(6);
        //obj.display();
        //obj.removeDataFromList(7);
        obj.display();



        //System.out.println(obj.containsElement(12));

//        ListNode result2 = obj.reverseList();
//        System.out.print("Reverse of the ListNode: ");
//        obj.display2(result2);

//        ListNode result3 = obj.middleNode();
//        System.out.print(result3.data);
//        System.out.println(" --> null");

//        ListNode result4 = obj.nThNodeFromEnd(2);
//        System.out.print(result4.data);
//        System.out.println(" --> null");




        //ListNode result = obj.deleteLast();
        //obj.display();
        //System.out.print("The ListNode that was deleted: ");
        //System.out.print(result.data);
        //System.out.println(" --> " + result.next);



        //System.out.println("Length is: "+ obj.lengthOfList());

        SinglyLinkedList obj3 = new SinglyLinkedList();

        ListNode first = new ListNode(1);
        ListNode second3 = new ListNode(6);
        ListNode third3 = new ListNode(7);
        ListNode forth3 = new ListNode(9);
        ListNode fifth3 = new ListNode(12);
        ListNode sixth3 = new ListNode(14);
        ListNode seventh3 = new ListNode(19);

        obj3.head = first;
        first.next = second3;
        second3.next = third3;
        third3.next = forth3;
        forth3.next = fifth3;
        fifth3.next = sixth3;
        sixth3.next = seventh3;
        obj3.display();

        //seventh3.next = third3;
        //System.out.println(obj3.isLoopedList());
        //System.out.println(obj3.startOfLoopedList().data);
        //obj3.removeLoopFromList();
        //System.out.println(obj3.isLoopedList());
        //obj3.display();

        ListNode resultant = testing.mergeSortedList(obj3.head,obj.head);
        testing.display2(resultant);

        SinglyLinkedList a = new SinglyLinkedList();
        SinglyLinkedList b = new SinglyLinkedList();

        a.head = new ListNode(7);
        ListNode sec = new ListNode(4);
        ListNode thir = new ListNode(9);

        a.head.next = sec;
        sec.next = thir;

        b.head = new ListNode(5);
        ListNode sec2 = new ListNode(6);
        b.head.next = sec2;



        a.display();
        b.display();

        ListNode resultant2 = testing.addTwoList(a.head, b.head);
        testing.display2(resultant2);

    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void display2(ListNode head){
        ListNode current = head;
        while (current != null) {
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

        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertLast(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;

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
    public void insertDataAtPosition(int data, int position){
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
    public void deleteFirst(){
        if(head == null)
            return;
        ListNode temp = head;
        head = head.next;
        temp.next = null;
    }
    public void removeAtPosition(int position){
        if(position == 1)
            head = head.next;
        ListNode previous = head;
        int count = 1;
        while (count < position-1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next = current.next;
    }
    public boolean containsElement(int searchKey){
        ListNode current = head;
        while (current.next != null){
            if(current.data == searchKey)
                return true;
            else
                current = current.next;
        }
        return false;
    }
    public ListNode reverseList(){
        if(head.next == null)
            return head;
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
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    public ListNode nThNodeFromEnd(int n){
        if(n == 1)
            return head;
        ListNode mainPointer = head;
        ListNode refPointer = head;
        int count = 0;
        while (count < n){
            refPointer = refPointer.next;
            count++;
        }
        while (refPointer != null){
            mainPointer = mainPointer.next;
            refPointer = refPointer.next;
        }
        return mainPointer;
    }

    public void removeDuplicate(){
        ListNode current = head;
        while (current != null && current.next != null){
            if(current.data == current.next.data)
                current.next=current.next.next;

            else
                current = current.next;
        }
    }
    public void insertDataToSortedList(ListNode newNode){
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        assert temp != null;
        temp.next = newNode;

    }

    public void removeDataFromList(int data){
        ListNode current = head;
        ListNode previous = null;
        while (current != null && current.data != data){
            previous = current;
            current = current.next;
        }
        if(current == null)
            return;
        previous.next = current.next;
    }

    public boolean isLoopedList(){
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null & fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer)
                return true;
        }
        return false;
    }
    public ListNode startOfLoopedList(){
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer)
                return getStartingNode(slowPointer);

        }
        return null;
    }
    public ListNode getStartingNode(ListNode slowPointer){
        ListNode temp = head;
        while ( temp != slowPointer){
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        return temp;
    }
    public void removeLoopFromList(){
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer) {
                changeToNull(slowPointer);
                return;
            }
        }
    }
    public void changeToNull(ListNode slowPointer){
        ListNode temp = head;
        while(temp.next != slowPointer.next){
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = null;
    }
    public ListNode mergeSortedList(ListNode object1, ListNode object2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (object1 != null && object2 != null){
            if(object1.data <= object2.data){
               temp.next = object1;
               object1 = object1.next;
            }
            else {
                temp.next = object2;
                object2 = object2.next;
            }
            temp = temp.next;
        }
        if(object1 == null)
            temp.next = object2;
        else
            temp.next = object1;
        return dummy.next;
    }

    public ListNode addTwoList(ListNode a,ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode ref = dummy;
        int carry = 0;
        while (a != null || b != null){
            int x = (a != null)? a.data: 0;
            int y = (b != null)? b.data: 0;
            int sum = (x+y+carry)%10;
            ref.next = new ListNode(sum);
            ref = ref.next;
            carry = (x+y+carry)/10;
            if(a != null) a = a.next;
            if(b != null) b = b.next;

        }
        if(carry > 0) ref.next = new ListNode(carry);
        return dummy.next;
    }






}
