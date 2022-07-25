package org.day14practice;

public class LinkedListOperation {
    Node head,tail;
    //function used to add object to LinkedList
    public void add(Object data){
        Node node = new Node(data);
        if(head==null){
            head= node;
            tail=node;
        }
        else {
            node.setNext(head);
            head=node;
        }
    }
    // Function used to display all the object sof List
    public void  showData(){
        Node temp=head;
        if(head==null){
            System.out.println("LinkedList is empty");
        }
        else {
            while (temp!=null){
                System.out.print(temp.getData()+" ");
                temp= temp.getNext();
            }
            System.out.println();
        }
    }
    // function to insert data in between
    public void insert(Object preData , Object data){
        Node temp = head;
        Node node= new Node(data);
        while (temp!=null) {
            if(temp.getData().equals(preData)){
                node.setNext(temp.getNext());
                temp.setNext(node);
                break;
            }
            temp= temp.getNext();
        }
    }
//    public Object pop(){
//        //Node temp = head;
//        if(head==null){
//            System.out.println("List is empty");
//        }
//        else {
//            Object value = head.getData();
//            head=head.getNext();
//            return value;
//        }
//        return null;
//    }
}
