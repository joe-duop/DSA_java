package com.joe.arrays;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryList(String item){
        //adding an item in a list
        if (exists(item)) {
            System.out.println("item already exists");
        } else {
            groceryList.add(item);
            System.out.println("item added");
        }
    }

    public void printGroceryList(){
        //listing all the items in the grocery list.
        System.out.println("you have "  + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    private void ModifyGroceryItem(int position, String newItem){
        //changing the name of a grocery item.
        if (position == -1) {
            System.out.println("the item to be replaced was not found");
        } else {
            groceryList.set(position, newItem);
            System.out.println("the item " + groceryList.get(position) + " has been modified to " + newItem);
        }
    }

    public void ModifyGroceryItem(String oldItem, String newItem){
        //changing the name of a grocery item.
        int position = groceryList.indexOf(oldItem);
        ModifyGroceryItem(position, newItem);
    }

    private void removeGroceryItem(int position){
        //removing an item from the groceryList
        if (position == -1) {
            System.out.println("the item is not found");
        } else {
            String itemRemoved = groceryList.get(position);
            groceryList.remove(position);
            System.out.println("the item " + itemRemoved + " has been removed");
        }
    }

    public void removeGroceryItem(String item){
        //removing an item from the groceryList
        int position = groceryList.indexOf(item);
        removeGroceryItem(position);
    }

    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        } else {
            return null;
        }
    }

    public boolean exists(String string){
        for (String i:groceryList) {
            if (string.equals(i)) {
                return true;
            }
        }
        return false;
    }





}
