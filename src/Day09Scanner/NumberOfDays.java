package Day09Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int month=2;
        String result="";

        switch (month){

            case 2:
            result ="28days";
            break;

            case 1: case 3:case 5:case 7:case 8: case 10:case 12:
                result="31 days";
                break;

            case 4:case 6:case 9:case 11:
                result= ("30 Days");
                break;

            default:
                result="Invalid";

            System.out.println(result);










        }
    }

}
