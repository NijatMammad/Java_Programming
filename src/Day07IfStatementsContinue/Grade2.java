package Day07IfStatementsContinue;

public class Grade2 {
    public static void main(String[] args) {
        int gradeLevel = 12;
        String result = "";

        if (gradeLevel >1&& gradeLevel<5){
            result = "Elementary Scool";
        } else if (gradeLevel>=6 && gradeLevel<=8) {
            result="Middle Scool";
        } else if (gradeLevel>=9&& gradeLevel<=12) {
            result="High School";
        } else if (gradeLevel>=13&&gradeLevel<=16) {
            result="College";
        } else {
            result="Grand School";
        }
        System.out.println(result);


    }
}
