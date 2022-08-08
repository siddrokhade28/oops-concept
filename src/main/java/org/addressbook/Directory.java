package org.addressbook;

import java.util.Scanner;

public class Directory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Idirectory id = new DirectoryOperation();
        while (true) {
            System.out.println("Enter 1 Add Address Book");
            System.out.println("Enter 2 to display Directories");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    id.addContactToBook();
                    break;
                case 2:
                    id.showAddressBook();
                    break;
            }
        }
    }
}
