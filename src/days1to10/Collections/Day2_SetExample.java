package days1to10.Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Day2_SetExample {

    public static void main(String[] args){
        Set<String> names = new HashSet<>();

        names.add("Vikram");
        names.add("Imran");
        names.add("Imran");
        names.add("Surya");

        Set<String> name = Collections.singleton("Hello");

        System.out.println(names);
        System.out.println(name);
    }
}
