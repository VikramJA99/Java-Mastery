package vikram.Java8FeatureProblems;


import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface IsEven{
    boolean check(int n);
}



//Create a lambda to check if a number is even
public class Problem_1 {

    public static void main(String[] args){

        IsEven isEven = (n) -> n % 2 == 0;


        List<Integer> list = Arrays.asList(2,4,6,10, 11,13)
                .stream()
                .filter(isEven ::check)
                //.filter(n-> n % 2 ==0)
                .toList();

            System.out.println(list);





        // using if Statement
//        int num = 10;
//        if (num % 2 ==0){
//            System.out.println("Even number");
//        } else {
//            System.out.println("Not Even number");
//        }
        //using lamba



    }


}
