package CoreJava.Java8;

import java.util.Arrays;
import java.util.List;

public class Example_Java8 {

    public static void main(String[] args){


        //ToList
        List<String> name = Arrays.asList("Imran","Vikram","Surya")
                .stream()
                .toList();
        System.out.println(name);

        //Find a Even Number
        List<Integer> even = Arrays.asList(1,2,3,4,5,1,2,3,13,14,15)
                .stream()
                .filter(n -> n % 2==0)
                .toList();
        System.out.println("Even number is : " + even );

        //Find a Odd number

        List<Integer> odd = Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                .stream()
                .filter(n->n%2 ==1)
                .toList();
        System.out.println("Odd number is :" + odd);


        List<Integer> num = Arrays.asList(1,2,3,4,5,6)
                .stream()
                .filter(n->n%2==0)
                .map(n->n *10)
                .toList();
        System.out.println(num);

        List<Integer> copy = Arrays.asList(1,2,3,4,2,3,4)
                .stream()
                .distinct()
                .toList();

        System.out.println(copy);


        List<Integer> sort = Arrays.asList(0,9,8,7,6,5,4,3,2,1)
                .stream()
                .sorted()
                .toList();
        System.out.println(sort);


    }



}
