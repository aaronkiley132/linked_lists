package com.company;

public class Stack extends LinkedList{

    int sizeLimit;

    public Stack(int[] data, int limit){
        super(data);
        this.sizeLimit = limit;
    }

    //adds an item to the top of the stack
    void push(int n){
        //create new listNode for n
        ListNode newStackItem = new ListNode(n);
        //set pointer of n to head
        newStackItem.next = this.getHead();
        //set head to n
        this.setHead(newStackItem);
    }

    //returns the last element pushed to the stack
    ListNode peek(){
        return this.getHead();
    }

    //removes the top element / most recently pushed from the stack
    ListNode pop(){
        ListNode toPop = this.getHead();
        this.setHead(toPop.next);
        return toPop;
    }

    boolean isFull(){
        if ( size() >= sizeLimit){
            return true;
        }
            return false;
    }

    int size(){
        int size = 0;
        if (isEmpty() == false) {
            ListNode current = this.getHead();
            while (current != null){
                size++;
            } return size;
        }else{
            return 0;
        }

    }

}
