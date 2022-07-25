package org.day14practice;
//main class for operation
public class LinkedListMain {
    public static void main(String[] args) {
       // creating object for opertaions class
        LinkedListOperation operation = new LinkedListOperation();
//        operation.add(70);
//        operation.add(30);
//        operation.add(56);
//        operation.add(60);
//        operation.add(70);
//        operation.add("hello");
//        operation.showData();
//        System.out.println("popped value is "+ operation.pop());
//        operation.showData();
        operation.add(70);
        operation.add(30);
        operation.add(56);
        operation.add(38);
        operation.add(73);
        operation.add(98);
        operation.showData();
        operation.popLast();
        operation.popLast();
        operation.popLast();

        System.out.println();
        operation.showData();
//        System.out.println( operation.search(30));
//        System.out.println( operation.search(70));
//        System.out.println( operation.search(56));

    }

}
