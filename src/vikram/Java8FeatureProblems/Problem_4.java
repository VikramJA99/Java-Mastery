package vikram.Java8FeatureProblems;

/*
Given a list of integers, find:
max
min
sum
average
count
Using stream().mapToInt().
 */

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Problem_4 {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

              int max =  list.stream()
                .mapToInt(Integer::intValue)
                .max()
                      .orElseThrow();

              int min = list.stream()
                      .mapToInt(Integer::intValue)
                      .min()
                      .orElseThrow();

              int sum = list.stream()
                      .mapToInt(Integer::intValue)
                      .sum();

        OptionalDouble average = list.stream()
                      .mapToInt(Integer::intValue)
                      .average();

                long count = list.stream()
                        .mapToInt(Integer::intValue)
                        .count();


                System.out.println("Min : " + min);
                System.out.println("Min : " +min);
                System.out.println("Sum : " +sum);
                System.out.println("Average : " + average);
                System.out.println("Count : " + count);

    }
}
