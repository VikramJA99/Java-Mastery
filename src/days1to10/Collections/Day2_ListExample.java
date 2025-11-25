package days1to10.Collections;

import java.util.*;
import java.util.stream.Collectors;



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

    // remove d
        List<String> list4 = new ArrayList<>(Arrays.asList("Vikram","Vikram","Vikram"))
                .stream()
                .distinct()
                .toList();
        System.out.println(list4);


        List<Integer> list5 = new ArrayList<>(Arrays.asList(23,25,23,26,27))
                .stream()
                .toList().reversed();
        System.out.println(list5);


        // filter name


        List<String> list6 = new ArrayList<>(Arrays.asList("Vikram","Ben","Imran","Vicky","Surya"))
                .stream()
                // start with name
                //.filter(s -> s.startsWith("B"))
                // end with name
                //.filter(s -> s.endsWith("a"))
                // contains a name value
                //.filter(s -> s.contains("ram"))
                //equals with name
                //.filter(s -> s.equals("Vicky"))
                .toList();
        System.out.println(list6);



        List<String> str =  Arrays.asList("        Apple","Banana   ","Mango  ","  Kiwi","Jack  fruit");

        List<String> cleanedList = str.stream()
                .map(cl -> cl.trim()).map(cl -> cl.replaceAll("\\s+", " "))
                .collect(Collectors.toList());

        List<String> sortedList = cleanedList.stream()
                .sorted((s1 , s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());

        System.out.println("Original List : " + str);
        System.out.println("Cleaned List : " + cleanedList);
        System.out.println("Sorted List : " + sortedList);




        //Given a list of integers, count the frequency of each element using HashMap.

        List<Integer> list7 = Arrays.asList(1,3,2,4,5,3,2,6,7);

//        Map<Integer, Integer> frq = new HashMap<>();
//        for (Integer num : list7){
//            frq.put(num, frq.getOrDefault(num, 0) +1);
//        }
//        System.out.println(frq);

        //If you want using Streams

        Map<Integer, Long> frq = list7.stream()
                .collect(Collectors.
                        groupingBy(n->n, Collectors.counting()));

        System.out.println(frq);

        //Remove Duplicates using HashSet

        List<Integer> list8 = Arrays.asList(1,2,3,2,3,4,5,6,4,5,8);

        Set<Integer> set = new HashSet<>(list8);
        System.out.println(set);

       // Using LinkedHashSet (Preserves order)

        Set<Integer> set1 = new LinkedHashSet<>(list8);
        List<Integer> noDuplicates = new ArrayList<>(set1);

        System.out.println(set1);

        //3. Sort a List

//        List<Integer> list9 = Arrays.asList(1,3,4,5,2,6,7)
//                .stream()
//                .sorted()
//                .toList();

       // System.out.println(list9);
        //Using Collections.sort() (Most common)
        List<Integer> list9 = Arrays.asList(1,3,4,5,2,6,7);
                Collections.sort(list9);
                System.out.println(list9);

        //4. Check if Key Exists

        Map<Integer, String> list10 = new HashMap<>();
        list10.put(1,"A");
        list10.put(2,"B");
        list10.put(3,"C");
        list10.put(4,"D");

        if (list10.containsKey(4)){
            System.out.println("Keys exists");
        } else {
            System.out.println("Key does not exist");
        }





     }

}
