package Day06_IfStatement;

public class IfAndElseStatementInfo {
    public static void main(String[] args) {

        int age = 28;
        if (age >= 21) {
            System.out.println("Eligible");
        }
        if (age < 21) {
            System.out.println("NOT Eligible");
        }

        System.out.println("___________________________________________________________");

        if (age >= 21) {
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        int score =35;
        if (score>=60) {
            System.out.println("passed");
        }else{
            System.out.println("Failed");

        }


    }
}
