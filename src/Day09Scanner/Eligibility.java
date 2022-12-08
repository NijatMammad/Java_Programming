package Day09Scanner;

import java.util.Scanner;
import java.util.SortedMap;

public class Eligibility {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        String result="";
        result=(age<21)?"Sorry, you are not eligible for this purchase"
                :(result="You are eligible");
        System.out.println(result);

    }
}
