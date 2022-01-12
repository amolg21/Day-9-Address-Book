package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    private Scanner scanner =new Scanner(System.in);

    public Contacts addContacts () {

        Contacts con = new Contacts();

        System.out.println("Enter FirstName ");
        String firstName=scanner.nextLine();
        System.out.println("Enter LastName ");
        String lastName=scanner.nextLine();
        System.out.println("Enter Address ");
        String address=scanner.nextLine();
        System.out.println("Enter City ");
        String city=scanner.nextLine();
        System.out.println("Enter State ");
        String state=scanner.nextLine();
        System.out.println("Enter Zip Code ");
        String zip=scanner.nextLine();
        System.out.println("Enter Mobile No ");
        String mobileNo=scanner.nextLine();
        System.out.println("Enter email ");
        String email=scanner.nextLine();

        return con;
    }

    public static void main(String[] args) {
        
    }
}
