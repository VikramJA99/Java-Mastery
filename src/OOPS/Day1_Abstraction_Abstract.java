package OOPS;

abstract class Payment{
    abstract void cash();
    void money(){
        System.out.println("Cash in Hand");
    }
}
class cost extends Payment{
    @Override
    void cash() {
        System.out.println("Cash only online");
    }
}

public class Day1_Abstraction_Abstract {
    public static void main(String[] args){
        cost obj = new cost();
        obj.cash();
        obj.money();

    }
}
