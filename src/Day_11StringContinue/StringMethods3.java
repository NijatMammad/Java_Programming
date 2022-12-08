package Day_11StringContinue;

public class StringMethods3 {
    public static void main(String[] args) {
        String word="";
        boolean r1=word.isEmpty();
        System.out.println(r1);

        String sentence= "My favorite programming language is JAVA";
        boolean program= sentence.toLowerCase().contains("java");
        System.out.println("program = " + program);



    }
}
