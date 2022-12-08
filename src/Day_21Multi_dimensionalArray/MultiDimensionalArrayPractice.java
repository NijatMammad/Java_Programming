package Day_21Multi_dimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {
        String[] group1={"James" , "Daniel"};
        String[] group2={"Nic","Sabina","Murad"};
        String[] group3={"Sophia", "Maya", "John", "Rocky", "Muhtar"};
        String[] group4={"Adelina", "Jade"};

        String[][] groups={group1,group2, group3, group4};
        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup=groups[i];
            System.out.println(Arrays.toString(eachGroup));
            
        }

    }
}
