package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

      public static void main(String[] args) {
            int choice;
            AddressBook addressBook = new AddressBook();
            do {
                Scanner scan = new Scanner(System.in);
                System.out.println("Welcome to Address Book.");
                System.out.println("Kindly Enter choice \n 1. Add new Contact \n 2. Edit Contact details \n 3. Show details  \n 4 Delete Contact \n 5. Quit");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        addressBook.addContacts();
                        break;
                    case 2:
                        addressBook.editContact();
                        break;
                    case 3:
                        addressBook.showContacts();
                        break;
                    case 4:
                        addressBook.deleteContact();
                        break;
                    case 5:
                        System.out.println("Thank you.");
                        break;
                    case 6:
                        System.out.println("Try again.");
                        
                }
            }while (choice != 6);
        }

    }


