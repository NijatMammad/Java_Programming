package Day_11StringContinue;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the first string:");
        String first= input.nextLine();
        System.out.println("Enter the second string:");
        String second= input.nextLine();
        input.close();

        if (first.length()>second.length()) {
            System.out.println("First String is the longest");
        } else if (first.length()<second.length()) {
            System.out.println("Second String is the longest");

        }else {
            System.out.println("Equal");
        }


    }

}
/*
1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string,
			if both have the same number of characters then print "Equal"
 */