package Day_20forEach;

public class forEachLoop {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("____________________________");
        for ( int each : numbers ){
            System.out.println(each);
        }
        System.out.println("____________________________");
    }
}
