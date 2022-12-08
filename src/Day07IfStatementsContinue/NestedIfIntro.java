package Day07IfStatementsContinue;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score=-100;
        if (score>=0&& score<=100){
            if (score>=60){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }

        }else {
            System.out.println("Invalid score");
        }
        System.out.println("______________________________________________________________________");


        int age=56;

        if (age>=1&&age<=150) {
            if (age < 21) {
                System.out.println("Not Eligible");
            } else {
                System.out.println("Eligible");
            }
        }else{
            System.out.println("Invalid age");
        }
        System.out.println("______________________________________________________________________");




    }
    }
