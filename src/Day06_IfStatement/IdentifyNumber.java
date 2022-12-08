package Day06_IfStatement;

public class IdentifyNumber {

    public static void main(String[] args) {
        int number= 200;

        boolean Positive= number>0;
        boolean Negative=number<0;
       // boolean isZero=number==0;
        boolean isZero= !Positive && !Negative;


        System.out.println(number+" is positive number: "+ Positive );
        System.out.println(number+" is negative number: " + Negative );
        System.out.println(number +" is zero: "+ isZero );




    }
}
/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */