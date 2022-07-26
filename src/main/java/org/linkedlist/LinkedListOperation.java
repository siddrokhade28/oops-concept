package org.linkedlist;

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


    // function to add in sorted order
//    public void addSorted(Object data) {
//        Node node = new Node(data);
//        if (head == null) {
//            head = node;
//        } else {
//            Node temp = head;
//            while (temp != null) {
//               Node index = temp.getNext();
//                    if ((int)temp.getData()>(int)data) {
//                       head=node;
//                       head.setNext(temp);
//                       break;
//                    }
//                temp = temp.getNext();
//            }
//
//        }
//
//    }

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
    public void popLast() {
        Node temp = head;
        Node prev = head;
        if (head.getNext() == null) {
            head = null;
        } else {
            temp = temp.getNext();
            while (temp != null) {
                if (temp.getNext() == null) {
                    prev.setNext(null);
                    break;
                }
                prev = temp;
                temp = temp.getNext();
            }
        }

    }

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

    // function to delete a Data anywhere in the list
    public void delete(Object data) {
        Node temp = head;
        Node prev = head;
        if (head.getData().equals(data)) {
            head = head.getNext();
        } else {
            temp = temp.getNext();

            while (temp != null) {
                if (temp.getData().equals(data)) {
                    prev.setNext(temp.getNext());
                    break;
                }
                prev = temp;
                temp = temp.getNext();
            }
        }
    }

    // function to append the data at last
    public void append(Object data) {
        Node node = new Node(data);
        Node temp = head;
        if (head == null) {
            head = node;
        } else {
            while (temp != null) {
                if (temp.getNext() == null) {
                    temp.setNext(node);
                    break;
                }
                temp = temp.getNext();
            }
        }
    }
}
