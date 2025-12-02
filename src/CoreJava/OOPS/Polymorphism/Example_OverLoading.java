package CoreJava.OOPS.Polymorphism;

class Math{
    int add(int a, int b, int c){
       return a + b + c;
    }

    double add(double a, double b, double c){
        return a + b + c;
    }
}

public class Example_OverLoading {

    public static void main(String[] args){

        Math obj = new Math();

        System.out.println(obj.add(12,12,12));
        System.out.println(obj.add(12.2,13.2,14.2));
    }
}
