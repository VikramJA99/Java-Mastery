package days1to10.loop;

public class Day1_For_Loop {
    public static void main(String[] args){

        for (int i =5; i<= 10; i++){
            System.out.println("Count : " + i);
        }

        //Enhanced for loop
        int [] numbers = {10,20,30,40};{
            for (int num: numbers){
                System.out.println(num);
            }
        }

        //break statement

        for (int i=1;i<=10;i++){
            if (i == 6){
                break;
            }
            System.out.println(i);
        }

        //continue Statement

        for (int i=1; i<=6; i++){
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }

        String[] fruits = {"apple", "banana"};
        for (String f : fruits){
            System.out.println(f);
        }
    }

}
