package DSALearningPath.Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example_Array {

    public static void main(String[] args) {


        int[] num = new int[4];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        System.out.println(Arrays.toString(num));
        //update array
        num[0] = 100;
        System.out.println(Arrays.toString(num));
        //get value
        System.out.println(num[2]);

        // One-Dimensional Array
        int[] arry = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arry));

        //Two-Dimensional Array
        int[][] arrys = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arrys[1][2]); //6

        // Array lenght
        int[] lenght = {12, 34, 56, 78, 90};
        System.out.println(lenght.length);


        //using output for loop

        String[] name = {"Imran", "Vikram", "Surya"};

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
//        //for each loop
//        for (String names : name){
//            System.out.println(names);
//        }
//        //stream api using for each
//        Stream.of(name).forEach(System.out::println);

            //printing reverse arry
            for (int j = name.length -1; j >= 0; j --) {
                System.out.println(name[j]);
            }

            //Find thr MAX number

            int max = arry[0];
            for (int nums : arry){
                if (nums > max) max = nums;
            }
            System.out.println(max);

        int min = arry[0];
        for (int fun : arry){
            if (fun < min) min = fun;
        }
        System.out.println(min);




    }




}
