package Day08TernaryOperators;

public class TernaryIntro2 {
    public static void main(String[] args) {

        int number=45;
       /* String result="";
        if (number>=0){
            result = "Positive";
        }else if (number<=0) {
            result = "Negative";
        }else{
            result="zero";
        }
        System.out.println(result);

        */

        String result= number>=0 ?"Positive" :number<=0? "Negative" :"Zero";

        System.out.println(result);
        System.out.println("__________________________________________________________________");



    }
}
