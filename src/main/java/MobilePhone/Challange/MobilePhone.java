package MobilePhone.Challange;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean removeContact(Contact contact) {
        int contactIndex = findContact(contact);

        if (contactIndex < 0) {
            return false;
        }

        this.myContacts.remove(contactIndex);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactIndex = findContact(oldContact);

        if (contactIndex < 0) {
            return false;
        }

        this.myContacts.set(contactIndex, newContact);
        return true;
    }

    public Contact queryContact(String name) {
        int contactIndex = findContact(name);

        return contactIndex >= 0 ? this.myContacts.get(contactIndex) : null;
    }

    private int findContact(String name) {
        int contactIndex = -1;

        for (int i = 0; i < this.myContacts.toArray().length; i++) {
            if (name.equalsIgnoreCase(this.myContacts.get(i).getName())) {
                return i;
            }
        }
        return contactIndex;
    }

    private int findContact(Contact contact) {
        int contactIndex = -1;

        for (int i = 0; i < this.myContacts.toArray().length; i++) {
            if (contact.getName().equalsIgnoreCase(this.myContacts.get(i).getName())) {
                return i;
            }
        }
        return contactIndex;
    }

    public void printContacts() {

        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {

            System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean addNewContact(Contact contact) {

        for (Contact i : this.myContacts) {
            if (i.getName().equalsIgnoreCase(contact.getName())) {
                return false;
            }
        }

        return this.myContacts.add(contact);
    }
}
