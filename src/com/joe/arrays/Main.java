package com.joe.arrays;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printMenu();
        while (!quit){
            System.out.println("enter your choice");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    ModifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("\nPress");
        System.out.println("\t0 - To print choice options.");
        System.out.println("\t1 - To print the list of grocery items");
        System.out.println("\t2 - To add an item in the list");
        System.out.println("\t3 - To modify an item in the list");
        System.out.println("\t4 - To remove an item on the list");
        System.out.println("\t5 - To search for an item on the list");
        System.out.println("\t6 - To exit");
    }

    private static void addItem(){
        System.out.println("enter the a grocery item...(enter q to quit)");
        while (true) {
            String item = input.nextLine().toLowerCase();
            if (item.equals("q")) {
                break;
            } else {
                groceryList.addGroceryList(item);
            }
        }
    }

    private static void ModifyItem(){
        System.out.println("enter the name of the item you want to change...");
        String oldItem = input.nextLine().toLowerCase();
        System.out.println("enter the name of the new item");
        String newItem = input.nextLine();
        groceryList.ModifyGroceryItem(oldItem, newItem);
    }
    private static void removeItem(){
        System.out.println("enter the name of the item you want to remove");
        String item = input.nextLine().toLowerCase();
        groceryList.removeGroceryItem(item);
    }
    private static void searchForItem(){
        System.out.println("enter the item you want to search");
        String item = input.nextLine().toLowerCase();
        if (item == null) {
            System.out.println("the item was not found");
        } else {
            System.out.println(groceryList.findItem(item));
        }

    }

//    todo:searchitem returning null because of case sensitivity -finished
//    todo:if it is null, print item not found
//    todo: create a function that checks the position of an item.if it's out of bound or not
//    todo: small error in modify when checking if the item exists




}

