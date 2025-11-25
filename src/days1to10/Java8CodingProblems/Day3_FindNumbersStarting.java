package days1to10.Java8CodingProblems;


import java.util.Arrays;
import java.util.List;

public class Day3_FindNumbersStarting {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,12,34,112,15,17,81,26);

        List<String> set = list
                .stream().map(String :: valueOf)
                .filter(s -> s.startsWith("1"))
                .toList();
        System.out.println(set);
        

    }
}
