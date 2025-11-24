package days1to10.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day2_Lamdba_Expressions {
    public static void main(String[] args){

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        list.forEach(n -> System.out.println(n));
    }
}
