package Day_10Scanner2;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadfilesWiththScanner {
    public static void main(String[] args) throws IOException {
         Scanner scan=new Scanner(Path.of("src/Day_10Scanner2/Test.txt"));

      /*  System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());


       */
      //  System.out.println("___________________________________________________________________________");
       // System.out.println(scan.hasNext());
        scan.close();


    }
}
