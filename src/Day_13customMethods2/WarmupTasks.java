package Day_13customMethods2;

import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {
      /*  calculate(200,5,'/');
        calculate(1,100,'-');
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your two numbers and a math operator:");
        double n1=input.nextDouble(),
                n2=input.nextDouble();
        char operator =input.next().charAt(0);
        calculate(n1,n2, operator);
        */
eligibleToVote(18, true);

    }

    public static void calculate(double num1, double num2, char mathOperator){
        double result=0;

        switch (mathOperator){
            case'+':
                System.out.println(num1+" "+mathOperator+" "+num2+" "+"="+(num1+num2));
                break;
            case'-':
                System.out.println(num1+" "+mathOperator+" "+num2+" "+"="+(num1-num2));
                break;
            case '*':
                System.out.println(num1+" "+mathOperator+" "+num2+" "+"="+(num1*num2));
                break;
            case '/':
                System.out.println(num1+" "+mathOperator+" "+num2+" "+"="+(num1/num2));
                break;
            default:
                System.err.println("Invalid Operator");

        }

    }

    public static  void ageGroup(int age){
        if (age>=0&&age<=150){
            System.out.println((age<21)? "Teenager": (age<55)?"Adult": "Senior");
        }else {
            System.out.println("Invalid age: "+age);
        }

    }


    public static void eligibleToVote(int age, boolean isAmerican){
        if(age>=18&&isAmerican){
            System.out.println("You are Eligible to vote");
        }else{
            System.err.println("You are not eligible to vote");
        }

    }




}
/*

    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote

 */
