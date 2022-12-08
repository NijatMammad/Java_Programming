package Day08TernaryOperators;

public class TernaryIntro3 {
    public static void main(String[] args) {

        int score = 90;
        String result = (score >= 0 && score <= 100) ?
                (score >= 60) ? "Passed" : "Failed"
                : "Invalid";
        System.out.println(result);
        System.out.println("___________________________________________________________________________");

        int n = 5;
        String day = (n >= 1 && n <= 7) ?
                (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday" : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday"
    :"No such Day";
        System.out.println(day);


    }
    }

