package com.company;

public class Queue extends LinkedList{

    public Queue(int [] data){
        super(data);
    }

    public void enqueue(int data){
        super.addItem(data);
    }

    public void dequeue(){
        ListNode n = super.getHead();
        super.setHead(n.next);
    }

    public ListNode peek(){
        return super.getHead();
    }
}
