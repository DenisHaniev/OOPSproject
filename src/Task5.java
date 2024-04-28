package org.example.Project;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String str = "listen";
        String str1 = "silent";
        boolean st = true;
        if (str.length() != str1.length()) {
            System.out.println("not an anagram");
        } else {
            char[] arr1 = str.toCharArray();
            char[] arr2 = str1.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            st = Arrays.equals(arr1, arr2);
        }
        if (st) {
            System.out.println(str + " and " + str1 + " are anagrams");
        } else {
            System.out.println(str + " and " + str1 + " are not anagrams");
        }

    }
}

