package org.stack;

public class StackOperation {
    Node head;

    public void push(Object data) {
        Node node = new Node(data);
        if (head != null) {
            node.setNext(head);
        }
        head = node;

    }

    public void displayData() {
        Node temp = head;
        if (head == null) {
            System.out.println("LinkedList is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

}
