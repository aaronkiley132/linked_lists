package com.company;

public class ListNode {
    int data;
    ListNode next;

    ListNode(int d) {
        data = d;
        next = null;
    }

    public String toString(){
        return data + " " + next.data;
    }
}
