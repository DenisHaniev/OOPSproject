package org.example.Project;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<Integer> integers=new ArrayList<>(new LinkedHashSet<>());
        integers.add(10);
        integers.add(30);
        integers.add(10);
        integers.add(50);
        integers.add(1);
        Set<Integer> s=new LinkedHashSet<>(integers);
        System.out.println(s);
    }
}



