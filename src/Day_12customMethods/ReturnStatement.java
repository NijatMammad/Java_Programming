package Day_12customMethods;

public class ReturnStatement {
    public static void main(String[] args) {
        eligible(20);

        System.out.println(multiplication(10,5));

    }

    public static void eligible(int age){
        if (age<0||age>150){
            System.err.println("Invalid age: " +age);
            return;
        }
        if (age>=21){
            System.out.println("You are eligible to buy");
        }else{
            System.out.println("You are NOT eligible to buy");
        }
    }
    public static int multiplication (int n1, int n2){
        int result=n1*n2;

        return  result;
    }


}
