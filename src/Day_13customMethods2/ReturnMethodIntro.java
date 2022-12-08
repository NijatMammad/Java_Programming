package Day_13customMethods2;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        //if the sum is void method it will not return
        int total =addition(10,20);
        square(10);
        System.out.println(square(10));



    }
    public static void sum(int n1, int n2){
        int result=n1+n2;

    }

    public static int addition(int n1, int n2){
        int result= n1 + n2;
        return result;

    }

    public static int square (int num) {
        int square= num*num;
        return square;

    }


    public static int cube (int num){
        int cube=square(num)*num;
        return cube;
    }

    public static boolean isOdd (int num){

      return(num%2!=0)?true:false;


    }
    public static boolean isEven (int num){
        return !isOdd(num);
    }





}
