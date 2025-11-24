package days1to10.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day2_StreamAPIExample {
    public static void main(String[] args){

        // using filter to find even number
        List<Integer> obj = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,1))
                .stream()
                .filter(e -> e % 2==0)
                .toList();

        System.out.println(obj);


        //map

        List<String> name = new ArrayList<>(Arrays.asList("Vikram","Imran", "Surya"));
        List<String> upper = name.stream().map(String :: toUpperCase)
                .toList();
        System.out.println(upper);


        // sorted

        List<Integer> names = Arrays.asList(1,2,3,4,1,2,3)
//        List<Integer> num = names
                .stream()
                .sorted()
                .toList();

        System.out.println(names);

        // distinct with Integer String
        List<Integer> num = Arrays.asList(10,10,20,30,40,20);
        System.out.println(num.stream().distinct().toList());

        List<String> sum = Arrays.asList("Vikram", "Imran", "Surya", "Imran", "Vikram");
        System.out.println(sum.stream().distinct().toList());




    }

}
