package org.stackandqueue;
/*
main class to carry out the stack operations
 */
public class StackMain {
    public static void main(String[] args) {
        StackOperation operation = new StackOperation();
        operation.push(70);
        operation.push(30);
        operation.push(56);
        operation.displayData();
        operation.peak();

        QueueOperation queue = new QueueOperation();
        queue.add(56);
        queue.add(30);
        queue.add(70);
        queue.print();
    }
}
