package com.milestone;

//require a uniqueUD
//require firstName lastName
//name cannot be > 10 or null
//phone number cannot > 10 or null
//address cannot > 30 or null
public class Contact {
    private final String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    //constructor
    public Contact(String contactID, String firstName, String lastName, String phone, String address){

        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid Id");
        }

        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid First Name");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid Last Name");
        }
        if (phone == null || phone.length() > 10) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        if (address == null || address.length() > 10) {
            throw new IllegalArgumentException("Invalid Address");
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;


    }
//getters and setters
    public String getContactID(){
        return contactID;
    }

public String getFirstName(){
        return firstName;
}
public  void setFirstName(String firstName){
        this.firstName = firstName;
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid First Name");
        }
    }
public String getLastName(){
        return lastName;
    }
    public  void setLastName(String lastName){
        this.lastName = lastName;
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid Last Name");
        }
    }
    public String getPhoneNumber(){
        return phone;
    }
    public  void setPhoneNumber(String phone){
        this.phone = phone;
        if (phone == null || phone.length() > 10) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
    }
    public String getAddress(){
        return address;
    }

    public  void setAddress(String address){
        this.address = address;
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid Address");
        }
    }
}
