package days1to10.Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class Day2_QueueExample {
    public static void main(String[] args){
        Queue<String> names = new ArrayDeque<>();

        names.add("Imran");
        names.add("Ben");
        names.add("Vikram");
        names.add("Surya");

        System.out.println(names.remove());
        System.out.println(names.peek());
    }

}
