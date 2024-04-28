package org.example.Project;

public class Task7 {
    public static void main(String[] args) {
        String str="Hello, world!";
        int total= 1;
        int i = 0;
        while (i < str.length()) {

            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                total++;
            }
            i++;
        }
        System.out.println(total);
    }
}


