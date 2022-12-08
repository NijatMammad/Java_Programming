package Day_16NestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u=input.next();
        System.out.println("Enter your password: ");
        String p=input.next();
        if(u.equals("Cydeo")&& p.equals("WoodenSpoon") ){
            System.out.println("logged in");
        }else{
            for (int i = 0; i <3 ; i++) {
                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username: ");
                u= input.next();

                System.out.println("Enter your password: ");
                p=input.next();

                if(u.equals("Cydeo")&& p.equals("WoodenSpoon") ){// if the user enters valid credentials
                    System.out.println("You are logged in");
                    break;// exit the loop
                }
            }
        }
        if(!(u.equals("Cydeo")&& p.equals("WoodenSpoon"))){
            System.err.println("Your account now is locked, please contct to support team");
        }
        input.close();

    }
}
