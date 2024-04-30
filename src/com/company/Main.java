package com.company;

public class Main {

    public static void main(String[] args) {
        int [] data = {13, 7, 68};
        LinkedList list1 = new LinkedList(data);
        System.out.println(list1);
        list1.addItem(99);
        System.out.println(list1);
        list1.reverse();
        System.out.println(list1);


        Stack list2 = new Stack(data, 10);
        System.out.println(list2);
        list2.push(99);
        System.out.println(list2);
        list2.pop();
        System.out.println(list2);
        list2.peek();
        System.out.println(list2);

    }
}
