package days1to10.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day2_ListExample {

    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        names.add("Vikram");
        names.add("Imran");
        names.add("Surya");
        names.addFirst("Imram");
        names.addLast("Ben");


        List<String> name = new ArrayList<>();
        name.add("Vicky");
        name.add("Vicky");
        name.remove("Vicky");
        //Collections.sort(name);
        //name.removeAll(name);

        List<Integer> list = Arrays.asList(4, 1, 5, 6, 2, 3);
        Collections.sort(list);



        System.out.println(names);
        System.out.println(names.get(1));
        System.out.println(names.contains("Vikram"));
        System.out.println(names.containsAll(name));
        System.out.println(name.hashCode());
        System.out.println(name);
        System.out.println(list);



        ///  binary search and max & min Values

        List<Integer> list1 = Arrays.asList(10,20,30,40);
        int index =Collections.binarySearch(list1,20);
        Collections.reverse(list1);

        System.out.println(index);
        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));
        System.out.println(list1);

    /// Make Unmodifiable List (Read-Only)
        List<String> list2 = new ArrayList<>();
        list2.add("A");
//        list2 = Collections.unmodifiableList(list2);
//        list2.add("B");
//
//        System.out.println(list2);


        //Replace All Elements

        List<String> list3 = new ArrayList<>(Arrays.asList("A","B","C","D"));
        Collections.replaceAll(list3, "A","D");
        System.out.println(list3);
    }
}
