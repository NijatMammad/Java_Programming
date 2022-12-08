package Day_26_Statics;

public class ConstructorCalls2 {
    public  ConstructorCalls2(){
        System.out.println("Default");
    }
    public ConstructorCalls2(int a){
        this();
        System.out.println("int arg");
    }
    public ConstructorCalls2(String a){
        this(5);

        System.out.println("String arg");
    }

    public static void main(String[] args) {
        ConstructorCalls2 obj1=new ConstructorCalls2();
        System.out.println("_____________________________________________");

        ConstructorCalls2 obj2=new ConstructorCalls2(10);
        System.out.println("___________________________________");
        ConstructorCalls2 obj3 =new ConstructorCalls2("Java");



    }
}
