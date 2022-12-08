package Day_23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int max =Collections.max(list);
        int min=Collections.min(list);
        System.out.println(max);
        System.out.println(min);


    }
}
