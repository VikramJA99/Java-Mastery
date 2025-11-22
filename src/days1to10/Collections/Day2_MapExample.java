package days1to10.Collections;

import java.util.HashMap;
import java.util.Map;

public class Day2_MapExample {
    public static void main(String[] args){
        Map<Integer, String> names = new HashMap<>();

        names.put(1,"Imran");
        names.put(2,"Vikram");
        names.put(3,"Surya");

        System.out.println(names);

    }

}
