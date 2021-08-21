package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Problem");
        //creating object
        Contact omkar = new Contact();

        //First Name
        omkar.setFirstName("Omkar");
        System.out.println(omkar.getFirstName());
        //Last Name
        omkar.setLastName("Papal");
        System.out.println(omkar.getLastName());
        //Address
        omkar.setAddress("Hadapsar");
        System.out.println(omkar.getAddress());
        //City
        omkar.setCity("Pune");
        System.out.println(omkar.getCity());
        //State
        omkar.setState("Maharashtra");
        System.out.println(omkar.getState());
        //PinCode
        omkar.setPinCode("412308");
        System.out.println(omkar.getPinCode());
        //Email
        omkar.setEmail("Omkar");
        System.out.println(omkar.getEmail());
        //Mobile Number
        omkar.setMobNumber("7709547162");
        System.out.println(omkar.getMobNumber());
    }
}
