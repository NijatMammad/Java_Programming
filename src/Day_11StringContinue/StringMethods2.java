package Day_11StringContinue;

import Day04_Concatenation.PrimitiveTypeCastings;

public class StringMethods2 {
    public static void main(String[] args) {
        String sentence="I love Juve";
        sentence=sentence.replace("Juve", "ManCity");
        System.out.println(sentence);

        String word="Juvantus";
                word=word.replace('a', 'e');
        System.out.println(word);

        String sentence4="I love Java Programming";
       String languageName= sentence4.substring(7);
        System.out.println(languageName);


        String sentence5="Today is Sunday, tomorrow is Monday";
        String day=sentence5.substring(9,15);
        System.out.println(day);

        String str="Juve";
        String result=(str+"\n").repeat(10);
        System.out.println(result);

    }
}
