package com.example.demo;

public class Student {
    private static String name;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public void displayInfo() {
        System.out.println("Hello " + name + " from " + address.getCity() + "-" + address.getZipcode());
    }
}
