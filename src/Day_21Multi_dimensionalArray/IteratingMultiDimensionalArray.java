package Day_21Multi_dimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr2D={{10,20,30}, {40,50,60,70,80},{90,100}};
        for (int i=0;i<arr2D.length; i++){
            System.out.println(Arrays.toString(arr2D[i]));

        }
    }
}
