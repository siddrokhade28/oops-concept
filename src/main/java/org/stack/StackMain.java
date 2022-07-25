package org.stack;

public class StackMain {
    public static void main(String[] args) {
        StackOperation operation = new StackOperation();
        operation.push(70);
        operation.push(30);
        operation.push(56);
        operation.displayData();
    }
}
