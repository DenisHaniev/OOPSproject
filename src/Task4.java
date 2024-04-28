package org.example.Project;

public class Task4 {
    void isPalindrome(String madam) {
        StringBuilder a = new StringBuilder(madam);
        a.reverse();
        String b = a.toString();
        if (a.equals(b)) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {
        Task4 t4= new Task4();
        t4.isPalindrome("madam");
    }
}
