package org.example.Project;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Ankara");
        countries.add("China");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Ukraine");

        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).startsWith("A")) {
                System.out.println(countries.get(i).toLowerCase());
            }

        }
    }
}


