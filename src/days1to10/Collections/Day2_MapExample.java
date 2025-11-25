package days1to10.Collections;

import java.util.*;

public class Day2_MapExample {
    public static void main(String[] args){
        Map<Integer, String> names = new HashMap<>();

        names.put(1,"Imran");
        names.put(2,"Vikram");
        names.put(3,"Surya");

        System.out.println(names);

        //Find First Non-Repeating Element

        Map<Integer,String> map = new LinkedHashMap();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"A");

//        List<String> set = new ArrayList<>((Collection) map);
//
//        System.out.println(set);


    }

}
