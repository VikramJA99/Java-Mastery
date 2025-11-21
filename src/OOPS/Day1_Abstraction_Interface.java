package OOPS;

interface Pay{
    void payment();
}

class UPI implements Pay{
    public void payment(){
        System.out.println("only online payment");

    }
}

public class Day1_Abstraction_Interface {
    public static void main(String[] args){
        UPI obj = new UPI();
        obj.payment();
    }
}
