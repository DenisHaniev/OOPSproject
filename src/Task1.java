package org.example.Project;

public class Task1 {
    public static void main(String[] args) {
        String string1 = "Sunny day";
        String string2 = "Winter day";

        System.out.println("Before swapping:");
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        string1 = string1 + string2;
        string2 = string1.substring(0, string1.length() - string2.length());
        string1 = string1.substring(string2.length());

        System.out.println("After swapping:");
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

    }
}
