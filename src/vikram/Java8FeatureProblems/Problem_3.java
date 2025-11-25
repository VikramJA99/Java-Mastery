package vikram.Java8FeatureProblems;

import java.util.Arrays;
import java.util.List;

public class Problem_3 {
    /*
    Find all even numbers from a list (using stream)

    Input: List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);
    Output: [2, 4, 6, 8]
     */

    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8)
                .stream()
                .filter(n-> n % 2==0)
                .toList();
        System.out.println(nums);
    }
}
