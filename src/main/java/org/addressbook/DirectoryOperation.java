package org.addressbook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DirectoryOperation implements Idirectory {
    Scanner scanner = new Scanner(System.in);
    HashMap<String , List<Contacts>> map = new HashMap<>();
    @Override
    public void addContactToBook() {
        AddessBookApp addessBookApp = new AddessBookApp();
        System.out.println("Enter book Name");
        String BookName= scanner.next();
        map.put(BookName,addessBookApp.addBook());
    }

    @Override
    public void showAddressBook()
    {
        for (Map.Entry<String,List<Contacts>> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

    }
}
