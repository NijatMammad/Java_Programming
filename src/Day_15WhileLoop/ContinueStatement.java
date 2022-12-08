package Day_15WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("_________________________________________________________________");
        for (int i = 10; i < 21; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("_____________________________________________________________________");
        for (char i = 'A'; i <='G' ; i++) {
            if(i=='B'||i=='E')
            continue;
            System.out.println(i);
        }

    }
}
