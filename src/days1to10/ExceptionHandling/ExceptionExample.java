package days1to10.ExceptionHandling;


import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

    public static void main(String[] args){
        // first methods
//        int a = 10;
//        int b = 0;
//        int c = 0;
//
//        try {
//            c = a/b;
//        } catch (Exception e){
//            System.err.println("Error Occurred");
//        }

//        System.out.println(c);
        System.out.println("End progress");

    //Multiple Catch Blocks

        try {
            int[] arr = new int[5];
            arr[10] = 100;
//            int x = 10;
//            int y = 0;
//            int z = x/y;
        }catch (ArithmeticException e){
            System.out.println("Airth Error");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of memory");
        }
        catch (Exception e){
            System.out.println("General exception");
        }

        // finally
//        try {
//            int a =10 /2;
//        }catch (Exception e){
//            System.out.println("Exception");
//        }finally {
//            System.out.println("Always executed");
//        }

        //Custom Exception
//        class InvalidAgeException extends Exception{
//            public IllegalArgumentException(String messages) {
//                super(messages);
//            }
//
//        }
//
//        void check(int age) throws InvalidAgeException{
//            if (age < 18){
//                throw new InvalidAgeException("Age must be 18+");
//            }
//        }

        //nested try-catch
//        try {
//            try {
//                int a = 10/0;
//            }catch (ArithmeticException e){
//                System.out.println("Inner catch");
//            }
//        }catch (Exception e){
//            System.out.println("Outer catch");
//        }

        //Handle NullPointerException

        try {
            String x = null;
            System.out.println(x.length());
        }catch (NullPointerException e){
            System.out.println("Null value found");
        }




    }
    //throw Keyword (Manual Exception)
    public void CheckAge(int age){
        if (age < 18){
            throw new  IllegalArgumentException("Not eligible");
        }
    }

    //throws Keyword (Declaring Exception)
    public void readFile() throws IOException{
        FileReader fr = new  FileReader("test.first");
    }

}
