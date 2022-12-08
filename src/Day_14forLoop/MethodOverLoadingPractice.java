package Day_14forLoop;

public class MethodOverLoadingPractice {

    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(50, 40, 125));
        System.out.println(sum(2.5, 5.8));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return sum(num1, num2) + num3;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;

    }

    public static double sum(double num1, double num2, double num3) {
        return (num1 + num2) + num3;
    }
}
