package vikram.Java8FeatureProblems;

import java.util.Arrays;
import java.util.List;

public class Problem_2 {

    public static void main(String[] args){

        List<String> list = Arrays.asList("apple", "banana", "mango", "kiwi")
                .stream()
                .sorted((a , b) ->b.compareTo(a))
                .toList();
        System.out.println(list);


    }


}
