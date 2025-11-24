package days1to10.Java8;

@FunctionalInterface
interface MyFunc{
    void greet();
}

public class Day2_MyFunc {

    public static void main(String[] args){
        MyFunc obj = () -> System.out.println("Hello from functional Interface");
        obj.greet();

    }


}
