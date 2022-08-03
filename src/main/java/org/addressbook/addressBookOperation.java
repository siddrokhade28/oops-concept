package org.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class addressBookOperation implements addressBook {
    ArrayList<Contacts> contactList = new ArrayList();
    Contacts contacts = new Contacts();
    Scanner sc = new Scanner(System.in);

    //to set the contacts and storing them in ArrayList
    @Override
    public void addContact() {
        System.out.println("Enter First Name");
        String firstName = sc.next();
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        System.out.println("Enter Address");
        String address = sc.next();
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
        Contacts contacts = new Contacts(firstName, lastName, address, city, state, zip, phNo, email);
        contactList.add(contacts);

        System.out.println(contactList);
    }

    //to Edit a contct by name
    @Override
    public void editContact(String firstName) {
        boolean flag = false;
        for (Contacts contact : contactList) {
            if (contact.getFirstName().equals(firstName)) {
                flag = true;
                System.out.println("Enter the Number for following changes:");
                System.out.println("Enter 1 to Change First Name");
                System.out.println("Enter 2 to change Last Name");
                System.out.println("Enter 3 to change Address");
                System.out.println("Enter 4 to change City");
                System.out.println("Enter 5 to change State");
                System.out.println("Enter 6 to change Zip");
                System.out.println("Enter 7 to change Phone Number");
                System.out.println("Enter 8 to change Email");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter the new First Name");
                        contact.setFirstName(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter the new last name");
                        contact.setLastName(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter the new address");
                        contact.setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter the new city");
                        contact.setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter the new state");
                        contact.setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter the new zip");
                        contact.setZip(sc.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter the new Phone NUmber");
                        contact.setPhoNum(sc.nextInt());
                        break;
                    case 8:
                        System.out.println("Enter the new Email");
                        contact.setEmail(sc.next());
                        break;
                    default:
                        System.out.println("Wrong Choice Entered");
                        break;
                }


                break;
            }
        }
        if (flag == false) {
            System.out.println("Contact not present in the book");
        }
        //System.out.println(contactList);
    }

    //to delete a contact by name
    @Override
    public void deleteContact(String firstname) {
        boolean flag = false;
        for (Contacts contact : contactList) {
            if (contact.getFirstName().equals(firstname)) {
                flag = true;
                contactList.remove(contact);
                System.out.println("Contact Deleted");
                break;
            }
        }
        if (flag == false) {
            System.out.println("Contact not present in the book");
        }

    }

    //to display all contacts
    @Override
    public void daiplayAll() {
        System.out.println(contactList);
    }
}

