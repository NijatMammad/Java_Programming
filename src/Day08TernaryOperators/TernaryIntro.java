package Day08TernaryOperators;

public class TernaryIntro {
    public static void main(String[] args) {
        int score=120;
        String result = "";

        if (score >=60){
            result="Passed";

        }else {
            result="Failed";
        }
        System.out.println(result);
        System.out.println("_______________________________________________________________________");

        String result2= (score >=60) ?"Passed" :"Failed";

        System.out.println(result2);
        System.out.println("__________________________________________________________________________");
        int age= 36;
        String result3=(age>=21?"Eligible":"Not Eligible");
        System.out.println(result3);
        System.out.println("________________________________________________________________________________");



        }

    }
