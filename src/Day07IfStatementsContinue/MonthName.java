package Day07IfStatementsContinue;

public class MonthName {
    public static void main(String[] args) {

        int n = 7;
        String month = "";

        if (n >= 1 && n <= 12) {
            if (n == 1) month = "January";
            if (n == 2) month = "February";
            if (n == 3) month = "March";
            if (n == 4) month = "April";
            if (n == 5) month = "May";
            if (n == 6) month = "June";
            if (n == 7) month = "July";
            if (n == 8) month = "August";
            if (n == 9) month = "September";
            if (n == 10) month = "October";
            if (n == 11) month = "November";
            else month = "December";

        } else {
            month = "No such a month";
        }
        System.out.println("month = " + month);

    }
}

