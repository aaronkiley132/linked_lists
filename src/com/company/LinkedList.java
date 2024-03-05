package com.company;

public class LinkedList {
    private ListNode head;

    public LinkedList(int[] values) {
        ListNode n = new ListNode(values[0]);
        head = n;
        for (int i = 1; i < values.length; i++) {
            n.next = new ListNode(values[i]);
            n = n.next;
        }
    }

    public ListNode getHead() {
        return head;
    }

    public String toString(){
        //start at the head and assemble string of the data values
        ListNode n = getHead();
        //neater way of building up an output string without wasting memory
        StringBuilder result = new StringBuilder();
        while (n != null){
            result.append(Integer.toString(n.data));
            n = n.next;
            if (n != null){
                result.append(", ");
            }
        }
        return result.toString();
    }

    public void addItem(int value){
        // create a new node with the value
        ListNode newNode = new ListNode(value);
        // start at the head and step through nodes to the end
        ListNode n = getHead();
        while(n!= null && n.next != null){
            n = n.next;
        }
        // add the new node at this position
        n.next = newNode;
    }
}