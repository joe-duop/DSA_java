package com.joe.arrays.project1;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contactList;

    public MobilePhone() {
        this.contactList = new ArrayList<>();
    }

    // TODO: adding a contact (when adding use name)
    public boolean addContact(Contact contact){
        if (findContactIndex(contact.getName()) >= 0) {
            return false;
        } else {
            this.contactList.add(contact);
            return true;
        }
    }

    // TODO: listing the contacts
    public void printContacts() {
        System.out.println("There are " + this.contactList.size() + " contacts:");
        for (Contact contact: this.contactList) {
            System.out.println("Name: " + contact.getName() + ". Number: " + contact.getNumber());
        }
    }

    // TODO: updating a contact (when adding use name)
    public boolean updateContact(String name, Contact newContact) {
        int position = findContactIndex(name);
        if (position >= 0) {
            this.contactList.set(position, newContact);

            return true;
        } else {
            return false;
        }
    }

    // TODO: removing a contact
    public boolean removeContact(String name) {
        int position = findContactIndex(name);
        if (position >= 0) {
            this.contactList.remove(position);
            return true;
        } else {
            return false;
        }
    }

    // TODO: search for a contact
    // TODO: check whether a contact exists or not when adding removing n updating.
    private int findContactIndex(Contact contact){
        return this.contactList.indexOf(contact);
    }

    private int findContactIndex(String name){
        for (Contact contact: contactList) {
            if (contact.getName().equals(name)) {
                return this.contactList.indexOf(contact);
            }
        }
        return -1;
    }
}
