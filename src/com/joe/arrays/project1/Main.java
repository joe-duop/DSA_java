package com.joe.arrays.project1;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static MobilePhone contactList = new MobilePhone();

    public static void main(String[] args) {

        // set up the menu options
        boolean quit = false;
        System.out.println("contact app opened");
        printMenu();

        while (!quit) {
            System.out.println("enter a choice");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    contactList.printContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    //TODO: search
                    break;
                case 6:
                    System.out.println("closing the app...");
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Press:");
        System.out.println("\t0 - To show the menu");
        System.out.println("\t1 - To add contact");
        System.out.println("\t2 - To view all contacts");
        System.out.println("\t3 - To update a contact");
        System.out.println("\t4 - To delete a contact");
        System.out.println("\t5 - To to search for a contact");
        System.out.println("\t6 - To close the contact app");
    }

    public static void addContact() {
        System.out.println("enter the name of the new contact");
        String name = input.nextLine().toLowerCase();
        System.out.println("enter the number of the new contact");
        String number = input.nextLine().toLowerCase();
        Contact contact = Contact.createContact(name, number);
        if (contactList.addContact(contact)) {
            System.out.println("the contact " + name + " has been added");
        } else {
            System.out.println("the contact " + name + " already exists");
        }
    }

    public static void updateContact() {
        System.out.println("enter the name of the contact your want to edit");
        String name = input.nextLine().toLowerCase();
        System.out.println("enter the name of the new contact");
        String newName = input.nextLine().toLowerCase();
        System.out.println("enter the number of the new contact");
        String newNumber = input.nextLine().toLowerCase();
        Contact contact = Contact.createContact(newName, newNumber);
        if (contactList.updateContact(name, contact)) {
            System.out.println("the contact has been updated successfully");
        } else {
            System.out.println("the contact was not found");
        }

    }

    public static void deleteContact() {
        System.out.println("enter the name of the contact your want to delete");
        String name = input.nextLine().toLowerCase();
        if (contactList.removeContact(name)) {
            System.out.println("The contact has been successfully deleted");
        } else {
            System.out.println("the contact was not found");
        }
    }

}
