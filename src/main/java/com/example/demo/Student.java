package com.example.demo;

public class Student {
    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public void displayInfo() {
        System.out.println("Hello " + name);
    }
}
