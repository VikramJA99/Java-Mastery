package CoreJava.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class Example_Set {
    public static void main(String[] args){

        Set<Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(1);

        System.out.println(num);
    }
}
