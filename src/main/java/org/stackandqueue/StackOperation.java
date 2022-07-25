package org.stackandqueue;

public class StackOperation {
    Node head;
/*
function to add object to stack
 */
    public void push(Object data) {
        Node node = new Node(data);
        if (head != null) {
            node.setNext(head);
        }
        head = node;

    }
/*
function to display all the objects of stack
 */
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
// function to pop the object until stack is empty
    public void peak() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                Object value = temp.getData();
                temp = temp.getNext();
                System.out.println("popped vale " + value);
            }
        }
    }

}
