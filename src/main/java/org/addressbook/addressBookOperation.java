package org.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class addressBookOperation implements addressBook {
    ArrayList<Contacts> contactList = new ArrayList();
    Scanner sc = new Scanner(System.in);
    @Override
    public void addContact() {
        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        sc.nextLine();
        System.out.println("Enter Address");
        String address = sc.nextLine();
        System.out.println("Enter City");
        String city = sc.next();
        System.out.println("Enter State");
        String state = sc.next();
        System.out.println("Enter Zip Code");
        int zip = sc.nextInt();
        System.out.println("Enter Phone Number");
        long phNo = sc.nextLong();
        System.out.println("Enter email");
        String email = sc.next();
        Contacts contacts = new Contacts(firstName,lastName,address,city,state,zip,phNo,email);
        contactList.add(contacts);

        System.out.println(contactList);
    }

    @Override
    public void editContact(String firstName) {
        boolean flag= false;
        for(Contacts contact : contactList){
            if(contact.getFirstName().equals(firstName)){
                flag= true;
                System.out.println("Enter First Name");
                String FirstName = sc.next();
                System.out.println("Enter Last Name");
                String lastName = sc.next();
                sc.nextLine();
                System.out.println("Enter Address");
                String address = sc.nextLine();
                System.out.println("Enter City");
                String city = sc.next();
                System.out.println("Enter State");
                String state = sc.next();
                System.out.println("Enter Zip Code");
                int zip = sc.nextInt();
                System.out.println("Enter Phone Number");
                long phNo = sc.nextLong();
                System.out.println("Enter email");
                String email = sc.next();
                contact.setFirstName(FirstName);
                contact.setLastName(lastName);
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoNum(phNo);
                contact.setEmail(email);
                break;
            }
        }
        if(flag==false){
            System.out.println("Contact not present in the book");
        }
        System.out.println(contactList);
    }

    @Override
    public void daiplayAll() {
        System.out.println(contactList);
    }
}
