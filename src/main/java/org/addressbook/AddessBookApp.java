package org.addressbook;

import java.util.Scanner;

public class AddessBookApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addressBook operations = new addressBookOperation();
        while (true) {
            System.out.println("Enter 1 to add the contact");
            System.out.println("Enter 2 to Edit a contact by name");
            System.out.println("Enter 3 to Delete a contact by name");
            System.out.println("Enter 4 to display all contact");
            System.out.println("Enter any other number to exit");

            int input = sc.nextInt();
            switch (input) {
                case 1:
                    operations.addContact();
                    break;
                case 2:
                    System.out.println("Enter the contact name to be edited");
                    String name = sc.next();
                    operations.editContact(name);
                    break;
                case 3:
                    System.out.println("Enter the contact name to be edited");
                    name = sc.next();
                    operations.deleteContact(name);
                    break;
                case 4:
                    operations.daiplayAll();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
