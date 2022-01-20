package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    static Scanner sc = new Scanner(System.in);
    static Map<String, AddressBook> addressBookMap = new HashMap<>();

    public static void addNewAddressBook() {
        System.out.println("Enter new Name for your Address Book ");
        String bookName = sc.next();

        if (addressBookMap.containsKey(bookName)) {
            System.out.println("Address Book already exists.");
        }
        else {
            AddressBook addressBook = new AddressBook();
            addressBookMap.put(bookName,addressBook);

        }
    }

    public static void displayAddressBooks() {
        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public static void editAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the Address Book Name :");
        String bookName = sc.next();
        if(addressBookMap.containsKey(bookName)) {
            addressBookMap.get(bookName).contactOptions();
        } else {
            System.out.println("Entered Address Book Name is Not Present ");
        }
    }


    public static void deleteAddressBook() {
        displayAddressBooks();
        System.out.println("Enter the Address Book Name :");
        String bookName = sc.next();
        if(addressBookMap.containsKey(bookName)) {
            addressBookMap.remove(bookName);
            System.out.println("Address Book is Deleted");
        } else {
            System.out.println("Entered Address Book Name is Not Present");
        }
    }


    public static void main (String[]args){
        System.out.println("Welcome to Address Book Program");
        int choice;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Kindly Enter choice \n 1. Add New Address Book \n 2. Edit Address Book  \n 3. Display Address Book  \n 4. Delete Address book \n 5. Quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addNewAddressBook();
                    break;
                case 2:
                    editAddressBook();
                    break;
                case 3:
                    displayAddressBooks();
                    break;
                case 4:
                    deleteAddressBook();
                    break;
                case 5:
                    System.out.println("Thank you.");
                    break;
            }
        } while (choice != 5);
    }

}




