package Day_19Array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {


        String[]myGroup=new String[5];
        myGroup[0]="Desi";
        myGroup[1]="Tamara";
        myGroup[2]="Franco";
        myGroup[3]="Soujud";
        myGroup[myGroup.length-1]="Anton";
        System.out.println(Arrays.toString(myGroup));
        System.out.println("------------------------------");
        for (int i = myGroup.length-1; i>=0; i--) {
            System.out.println(myGroup[i]);
            System.out.println("------------------------------");
            for (int i1 = myGroup.length - 1; i1 >= 0; i1--) {
                
            }
            
        }





    }
}
