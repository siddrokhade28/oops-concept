package org.linkedlist;

import java.lang.reflect.Array;
import java.util.Arrays;

//main class for operation
public class LinkedListMain {
    public static void main(String[] args) {
        // creating object for opertaions class
        LinkedListOperation operation = new LinkedListOperation();
       int arr[] = {56,30,40, 70};
       Arrays.sort(arr);
       for (int i : arr){
           operation.append(i);
       }
       operation.showData();
       operation.add(70);
       operation.add(30);
       operation.add(56);
       operation.showData();
       System.out.println("----------------------");
       System.out.println("popped value is " + operation.pop());
       operation.showData();
       System.out.println("----------------------");
       operation.append(60);
       operation.showData();
       System.out.println("----------------------");
       operation.popLast();
       operation.showData();
       System.out.println("----------------------");
       operation.insert(70, 25);
       operation.showData();
       System.out.println("----------------------");
       System.out.println(operation.search(25));
       operation.delete(70);
       operation.showData();

    }

}
