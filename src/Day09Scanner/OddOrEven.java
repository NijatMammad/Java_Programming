package Day09Scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        String result = "";
        result = (num % 2 == 0)?  "Even"
                 :(result="Odd");


        System.out.println("result = " + result);
        input.close();

    }
}
