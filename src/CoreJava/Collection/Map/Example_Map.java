package CoreJava.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Example_Map {
    public static void main(String[] args){
        Map<Integer, String> name = new HashMap<>();

        name.put(1,"Imran");
        name.put(2,"Vikram");
        name.put(3,"Surya");
        name.put(4,"Imran");

        System.out.println(name);

    }

}
