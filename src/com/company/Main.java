package com.company;

public class Main {

    public static void main(String[] args) {
        int [] data = {13, 7, 68};
        System.out.println("Linked List");
        LinkedList list1 = new LinkedList(data);
        System.out.println(list1);
        list1.addItem(99);
        System.out.println(list1);
        list1.reverse();
        System.out.println(list1);


        System.out.println("Stack");
        Stack list2 = new Stack(data, 10);
        System.out.println(list2);
        list2.push(99);
        System.out.println(list2);
        list2.pop();
        System.out.println(list2);
        System.out.println(list2.peek().toString());
        System.out.println(list2);


        System.out.println("Queue");
        Queue list3 = new Queue(data);
        System.out.println(list3);
        list3.enqueue(99);
        System.out.println(list3);
        list3.dequeue();
        System.out.println(list3);
        System.out.println(list3.peek().toString());
        System.out.println(list3);

    }
}
