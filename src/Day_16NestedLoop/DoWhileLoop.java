package Day_16NestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean condition=false;

         for (; condition;) {
             System.out.println("Hello-For Loop");
         }
             while(condition){
                 System.out.println("Hello-while loop");
             }
             do {
                 System.out.println("Hello-DoWhile loop");
             }while (condition);
    }
}
