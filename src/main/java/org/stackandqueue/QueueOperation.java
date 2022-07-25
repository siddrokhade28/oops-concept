package org.stackandqueue;

public class QueueOperation {
    Node head;

    // function to add data in queue
    public void add(Object data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.getNext() == null) {
                    temp.setNext(node);
                    break;
                }
                temp = temp.getNext();
            }
        }
    }

    //function to display all queue data
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData()+" ");
            temp = temp.getNext();
        }
    }
    // fuction to de-queue
    public Object deQueue() {
        Object value = head.getData();
        head = head.getNext();
        return value;
    }
}

