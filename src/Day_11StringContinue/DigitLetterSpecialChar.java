package Day_11StringContinue;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        if (str.length() >= 1) {
            char f = str.charAt(0);
            if (f > 48 && f <= 57) {
                System.out.println("first character is digit");

            } else if (f >= 'A' && f <= 'Z') {
                System.out.println("first character is uppercase letter");
            } else if (f >= 'a' && f <= 'z') {
                System.out.println("first character is lowercase letter");

            } else {
                System.out.println("String is empty");
            }
        }
    }
}

/*
Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"
 */