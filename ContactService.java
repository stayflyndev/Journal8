package com.milestone;
import java.util.HashMap;
import java.util.Map;

//service class encaps logic for data
//APIs and components
//its middleware for UI and the data layer
//methods to manage contacts
public class ContactService {

    //an instance called contactMap with type Map
    //keys as String and Contact as values
private Map<String, Contact> contactMap;

public ContactService() {
    contactMap = new HashMap<>();
}

    // Add a new contact
    public void addContact(String contactID, String firstName, String lastName, String phone, String address) {
        if (contactMap.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact with this ID already exists.");
        }

        Contact newContact = new Contact(contactID, firstName, lastName, phone, address);
        contactMap.put(contactID, newContact);
    }

    // Remove an existing contact by ID
    public void removeContact(String contactID) {
        if (!contactMap.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact not found.");
        }

        contactMap.remove(contactID);
    }

    // Update name using the name method
    // verify name exists first
    // which then checks if the number entered is valid
    public void updateName(String contactID, String newFirstName, String newLastName) {
        Contact contact = contactMap.get(contactID);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found.");
        }

        contact.setFirstName(newFirstName);
        contact.setLastName(newLastName);
    }

    // Update phone number using the setPhoneNumber method
    // verify number exists first
    // which then checks if the number entered is valid
    public void updatePhone(String contactID, String newPhone) {
        Contact contact = contactMap.get(contactID);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found.");
        }

        contact.setPhoneNumber(newPhone);
    }

    // Update add using the setAddress method
    // verify add exists first
    // which then checks if the add entered is valid
    public void updateAddress(String contactID, String newAddress) {
        Contact contact = contactMap.get(contactID);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found.");
        }

        contact.setAddress(newAddress);
    }

    // Retrieve a contact by ID
    public Contact getContact(String contactID) {
        Contact contact = contactMap.get(contactID);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found.");
        }

        return contact;
    }

    // Get all contacts
    public Map<String, Contact> getAllContacts() {
        return new HashMap<>(contactMap);
    }
}
