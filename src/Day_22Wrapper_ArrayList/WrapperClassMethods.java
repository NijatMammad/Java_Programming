package Day_22Wrapper_ArrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str="20";
        System.out.println(str+1);
       // Integer num1=Integer.parseInt(str);
        int num=Integer.parseInt(str);
        System.out.println(num+1);
        Integer num2=Integer.valueOf(str);
        System.out.println(num2);
        System.out.println("______________________________________");
        String s="20.5";
        Double num3=Double.parseDouble(s);
       Double num4= Double.valueOf(s);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println("______________________________________");
        String x="true";
       boolean r1=Boolean.parseBoolean(x);
       Boolean r2=Boolean.parseBoolean(x);
        System.out.println(r1);
        System.out.println(r2);



    }
}
