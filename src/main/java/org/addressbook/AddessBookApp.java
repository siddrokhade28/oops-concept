package org.addressbook;

import java.util.Scanner;

public class AddessBookApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        addressBook operations = new addressBookOperation();
        while (true) {
            System.out.println("Enter 1 to add the contact");
            System.out.println("Enter 2 to exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    operations.addContact();
                    break;
                case 2:
                    String name = sc.next();
                    operations.editContact(name);
                    break;
                case 3:
                    operations.daiplayAll();
                    break;
                default:
                    break;
            }
        }
    }
}
