package OOPS;

class Cal{
    int add (int a, int b, int c){
        return a+b+c;
    }
    double add (double a, double b, double c){
        return a+b+c;
    }
}

public class Day1_Polymorphism {
    public static void main(String[] args){

        Cal obj = new Cal();
        System.out.println(obj.add(23,3,6));
        System.out.println(obj.add(34.6,55.6, 34.7));
    }

}
