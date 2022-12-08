package Day09Scanner;

import java.util.Scanner;

public class NextlineVSnext {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your age:");
        int age=input.nextInt();
        input.nextLine();


        System.out.println("Enter Your full name:");
        String name= input.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);

    }
}
