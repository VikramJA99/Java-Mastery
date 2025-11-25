package days1to10.Java8CodingProblems;

import java.util.Arrays;
import java.util.List;

public class Day3_EvenNumber {

    public static void main(String[] args){

        /*
        1. Find Even Numbers From a List Using Stream & filter.
         */
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8)
                .stream()
                .filter(n-> n % 2 == 0)
                .toList();
        System.out.println(list);

    }
}
