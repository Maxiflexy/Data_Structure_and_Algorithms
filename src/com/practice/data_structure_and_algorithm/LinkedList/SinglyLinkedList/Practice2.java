package com.practice.data_structure_and_algorithm.LinkedList.SinglyLinkedList;

public class Practice2 {

    private ListNode head;

    private static class ListNode{
        private final int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Practice2 object = new Practice2();
        Practice2 object2 = new Practice2();
        Practice2 object3 = new Practice2();
        Practice2 object4 = new Practice2();


        object.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);


        object.head.next = second;
        second.next = third;
        third.next = fourth;


        object2.head = new ListNode(1);
        ListNode two = new ListNode(1);
        ListNode three = new ListNode(1);
        ListNode four = new ListNode(2);
        ListNode five = new ListNode(2);
        ListNode six = new ListNode(3);
        ListNode seven = new ListNode(3);

        object2.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        object3.head = new ListNode(1);
        ListNode obj2 = new ListNode(8);
        ListNode obj3 = new ListNode(19);
        ListNode obj4 = new ListNode(11);
        ListNode obj5 = new ListNode(5);
        ListNode obj6 = new ListNode(12);
        ListNode obj7 = new ListNode(34);

        object3.head.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj5;
        obj5.next = obj6;
        obj6.next = obj7;
        obj7.next = obj3;

        object4.head = new ListNode(1);
        ListNode s1 = new ListNode(2);
        ListNode s2 = new ListNode(6);
        ListNode s3 = new ListNode(3);
        ListNode s4 = new ListNode(4);
        ListNode s5 = new ListNode(5);
        ListNode s6 = new ListNode(6);

        object4.head.next = s1;
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;
        s5.next = s6;


        ListNode head1 = new ListNode(2);
        ListNode m1 = new ListNode(4);
        ListNode m2 = new ListNode(3);

        head1.next = m1;
        m1.next = m2;

        ListNode head2 = new ListNode(5);
        ListNode n1 = new ListNode(6);
        ListNode n2 = new ListNode(4);

        head2.next = n1;
        n1.next = n2;



        //object.printListNodeElement();
        //object.lengthOfList();

        object.insertElementAtStartOfList(5);

        object.insertElementAtEndOfList(16);
        //object.printListNodeElement();
        //object.lengthOfList();

        object.insertElementAtGivenPosition(2, 5);

        object.deleteFirstNodeElement();

        object.deleteLastNodeElement();

        //object.deleteElementAtGivenPosition(4);

        //object.reverseElementInList();
        object.printListNodeElement();

        ListNode result = object.middleElementOfList();

        ListNode result2 = object.findTheNthNode(4);

        object.printNodeData(result2);

        object2.printListNodeElement();

        //object2.removeDuplicateFromSortedList();
        object2.printListNodeElement();

        //object3.printListNodeElement();
        //object3.insertNodeToSortedList(17);
        //object3.printListNodeElement();
        //object3.removeGivenData(16);
        //object3.printListNodeElement();
        boolean bool = object3.checkIfListContainsLoop();
        System.out.println(bool);
        System.out.println(object3.startNodeInALoop().data);

        object3.removeLoop();
        object3.printListNodeElement();


        object4.removeElements(6);
        object4.printListNodeElement();


        Practice2 object5 = new Practice2();
        //object5.head = mergeSortedList(head1, head2);
        //object5.printListNodeElement();

        Practice2 object6 = new Practice2();
        printListNodeElement(head1);
        printListNodeElement(head2);
        object6.head = addTwoNonNegativeList(head1, head2);
        object6.printListNodeElement();




    }

    public void printListNodeElement(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void printListNodeElement(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printNodeData(ListNode head){
        System.out.println(head.data);
    }

    public void lengthOfList(){
        if(head == null)
            System.out.println("Zero length");

        ListNode current = head;
        int count = 0;
        while (current != null){
            count++;
            current = current.next;
        }
        System.out.println("Length of the ListNode is : " + count);
    }

    public void insertElementAtStartOfList(int data){
        ListNode temp = new ListNode(data);
        temp.next = head;
        head = temp;
    }

    public void insertElementAtEndOfList(int data){
        ListNode temp = new ListNode(data);
        if(head == null) {
            head = temp;
            return;
        }
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = temp;
    }

    public void insertElementAtGivenPosition(int data, int position){
        ListNode newNode = new ListNode(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
        }else {
            ListNode current = head;
            int count = 1;
            while (count < position-1){
                current = current.next;
                count++;
            }
            ListNode temp = current.next;
            current.next = newNode;
            newNode.next = temp;
        }
    }

    public void deleteFirstNodeElement(){
        if(head == null)
            return;
        ListNode temp = head;
        head = temp.next;
        temp.next = null;
    }

    public void deleteLastNodeElement(){
        ListNode temp = head;
        if(temp.next != null){
            ListNode previous = temp.next;
            while (previous.next != null){
                previous = previous.next;
                temp = temp.next;
            }
            temp.next = null;
        }else
            head = null;

    }

    public void deleteElementAtGivenPosition(int position){
        ListNode temp = head;
        ListNode current = temp.next;
        int count = 1;
        if(position == 1){
            head = temp.next;
        }else {
            while (count<position-1){
                current = current.next;
                temp = temp.next;
                count++;
            }
            temp.next = current.next;
        }
    }

    public void reverseElementInList(){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public ListNode middleElementOfList(){
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    public ListNode findTheNthNode(int n){
        ListNode mainPointer = head;
        ListNode refPointer = head;
        int count = 0;
        while (count<n){
            refPointer = refPointer.next;
            count++;
        }
        while (refPointer != null){
            mainPointer = mainPointer.next;
            refPointer = refPointer.next;
        }
        return mainPointer;
    }

    public void removeDuplicateFromSortedList(){
        ListNode current = head;
        while (current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else
                current = current.next;
        }
    }

    public void insertNodeToSortedList(int data){

        ListNode newNode = new ListNode(data);
        ListNode temp = null;
        ListNode current = head;

        while (current != null && current.data < data){
            temp = current;
            current = current.next;
        }
        temp.next = newNode;
        newNode.next = current;
    }

    public void removeGivenData(int data){
        ListNode current = head;
        ListNode previous = null;

        while (current.data != data && current != null){
            previous = current;
            current = current.next;
        }
        previous.next = current.next;

    }

    public boolean checkIfListContainsLoop(){
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer)
                return true;
        }
        return false;
    }

    public ListNode startNodeInALoop(){
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer) {
               return getStartingNode(slowPointer);
            }
        }
        return null;
    }

    private ListNode getStartingNode(ListNode slowPointer) {
        ListNode temp = head;
        while (temp != slowPointer){
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        return temp;
    }
    public void removeLoop(){
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer) {
                removingTheLoop(slowPointer);
            }
        }

    }

    private void removingTheLoop(ListNode slowPointer) {
        ListNode temp = head;
        while (temp.next != slowPointer.next){
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = null;
    }

    public ListNode removeElements(int val) {
        ListNode current = head;
        ListNode staticNode = new ListNode(0);
        staticNode.next = head;
        ListNode previous = staticNode;

        while(current != null){
            if(current.data == val){
                previous.next = current.next;
            }else{
                previous = current;
            }
            current = current.next;
        }
        return staticNode.next;
    }

    public static ListNode mergeSortedList(ListNode head1,ListNode head2){

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (head1 != null && head2 != null){
            if(head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            }else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if(head1 == null)
            tail.next = head2;
        else
            tail.next = head1;

        return dummy.next;
    }

    public static ListNode addTwoNonNegativeList(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (a != null || b != null){
            int x = (a != null)? a.data: 0;
            int y = (b != null)? b.data: 0;
            int sum = carry + x + y;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            if(a != null)
                a = a.next;
            if(b != null)
                b = b.next;
            tail = tail.next;
        }
        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }

}
