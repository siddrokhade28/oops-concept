package org.day14practice;

public class LinkedListOperation {
    Node head, tail;

    //function used to add object to LinkedList
    public void add(Object data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
    }

    // Function used to display all the object sof List
    public void showData() {
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

    // function to insert data in between
    public void insert(Object preData, Object data) {
        Node temp = head;
        Node node = new Node(data);
        while (temp != null) {
            if (temp.getData().equals(preData)) {
                node.setNext(temp.getNext());
                temp.setNext(node);
                break;
            }
            temp = temp.getNext();
        }
    }

    // function to delete the data
    public Object pop() {
        //Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Object value = head.getData();
            head = head.getNext();
            return value;
        }
        return null;
    }

    // function to delete last data
//    public Object popLast() {
//        Node temp =head ,prevdata= head;
//        Object value=null;
//            while (temp != null)
//            {
//                if (temp.getNext() == null) {
//                    value = temp.getData();
//                    prevdata.setNext(null);
//                    break;
//                }
//                temp= temp.getNext();
//
//            }
//        return value;
//    }
//    // function to search an object in the list
    public int search(Object data) {
        int index = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(data)) {
                break;
            }
            temp = temp.getNext();
            index++;
        }


        return index;
    }
}
