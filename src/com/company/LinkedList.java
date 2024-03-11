package com.company;

public class LinkedList {
    private ListNode head;
    private ListNode current;

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

    public void resetNext(){
        //resets current to the begining of the list
        current = getHead();
    }

    public boolean hasNext(){
        boolean result  = true;
        //true if there is another item in the list
        if (current.next == null){
            result = false;
        }
        return result;
    }

    public ListNode getNext(){
        //retrieves an element (the next one) from the list
        return current.next;
    }

    public boolean isEmpty(){
        boolean result = false;
        //Ttrue if the list has no elements i.e. the head is null
        ListNode n = getHead();
        if ( n == null){
            result = true;
        }
        return result;
    }

    public void reverse(){
        ListNode n = getHead();
        ListNode m = getHead();
        ListNode x = new ListNode(0);
        m = m.next;
        //find the number of nodes
        int nodes = 0;
        while (n != null){
            nodes++;
            n = n.next;
        }
        System.out.println(nodes);
        n = getHead();
        //iterate through all items decreasing by one each time
        for (int i = 0; i < nodes; i++){
            for (int j = 0; j < nodes - (i); j++){
                //swap the pointers (n.next)
                x.next = m.next;
                m.next = n.next;
                n.next = x.next;
                if (m.next != null && n.next != null){
                m = m.next;
                n = n.next;
                }
            }
        }
        //swap last and head finally
        n = getHead();
        x = n;
        head.data = m.data;
        head.next = n.next;
        m.data = x.data;
        //m.next = x.next;
       // System.out.println(head);

    }
}