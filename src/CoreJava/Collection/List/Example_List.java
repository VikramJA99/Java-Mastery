package CoreJava.Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example_List {

    public static void main(String[] args){

        List<String> obj = new ArrayList<>();
        obj.add("Imran");
        obj.add("Vikram");
        obj.add("Surya");

        Collections.sort(obj);
        System.out.println(obj);
    }
}
