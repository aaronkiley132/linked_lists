package com.company;

public class Stack {

    LinkedList stack;
    int sizeLimit;

    public Stack(int[] data, int limit){
        this.stack = new LinkedList(data);
        this.sizeLimit = limit;
    }

    //adds an item to the top of the stack
    void push(int n){
        //create new listNode for n
        ListNode newStackItem = new ListNode(n);
        //set pointer of n to head
        newStackItem.next = stack.getHead();
        //set head to n
        stack.setHead(newStackItem);
    }

    //returns the last element pushed to the stack
    ListNode peek(){
        return stack.getHead();
    }

    //removes the top element / most recently pushed from the stack
    ListNode pop(){
        ListNode toPop = stack.getHead();
        stack.setHead(toPop.next);
        return toPop;
    }

    boolean isEmpty(){
        return stack.isEmpty();
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
            ListNode current = stack.getHead();
            while (current != null){
                size++;
            } return size;
        }else{
            return 0;
        }

    }

}
