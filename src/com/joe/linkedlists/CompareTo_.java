package com.joe.linkedlists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class CompareTo_ {

    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<>();
        addInOrder(places, "Nairobi");
        addInOrder(places, "Chwele");
        addInOrder(places, "Nakuru");
        addInOrder(places, "Tarbo");
        addInOrder(places, "Kisumu");
        addInOrder(places, "Bungoma");
        addInOrder(places, "Turkana");

//        printCities(places);
//        addInOrder(places, "Tarbo");
//        printCities(places);
        visit(places);

    }

    public static void printCities (LinkedList<String> places) {
        // prints all the items in the list
        Iterator<String> i = places.iterator();
        while (i.hasNext()) {
            System.out.println("you are now in " + i.next());
        }
    }

    public static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        // arranges the cities in alphabetical order uding compareTo
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            /* using comparison to arrange the cities alphabetically
            * ==0 means they are equal,
            * >0 means comes first(before),
            * <0 means comes second(after)
            * */
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // they are equal
                System.out.println("the place is already included.");
                return false;

            } else if (comparison > 0) {
                // parameter entered should be put first alphabetically (b -> a)
                stringListIterator.previous();
                stringListIterator.add(newCity); // TODO: 3/15/23 new stuff (learn)
                return true;

            } else if (comparison < 0) {
                // parameter entered should be put next alphabetically (a -> b)
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    public static void visit (LinkedList<String> cities) {
        //for going forth and back from the cities
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("the list has nothing in it");
        } else {
            System.out.println("now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = input.nextInt();
            input.nextLine();
            switch (action) {
                case 0:
                    System.out.println("holiday is over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("now moving to " + listIterator.next());
                    } else {
                        System.out.println("reached at the end of the list ");
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("now going back to " + listIterator.previous());
                    } else {
                        System.out.println("returned up to the top of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    public static void printMenu(){
        System.out.println("Press:");
        System.out.println("0 - to finish the holiday");
        System.out.println("1 - to go to the next destination");
        System.out.println("2 - to go back to the previous destination");
        System.out.println("3 - to print the menu");
    }

}
