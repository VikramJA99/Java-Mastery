package CoreJava.ExceptionHandling;

public class Example_ExceptionHandling {

    public static void main(String[] args){

        int i = 10;
        int j = 0;

        try {
            int z = i/j;
        }catch (Exception e){
            System.out.println("Code Error");
        }finally {
            System.out.println("Code is Running");
        }
    }
}
