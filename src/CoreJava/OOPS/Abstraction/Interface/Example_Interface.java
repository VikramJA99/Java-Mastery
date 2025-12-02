package CoreJava.OOPS.Abstraction.Interface;


class Dog implements Animal{

    @Override
    public void Eat() {
        System.out.println("Eating...........");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleeping........");

    }
}

class Car implements Animal{

    @Override
    public void Eat(){
        System.out.println("Eating the Food");

    }
    @Override
    public void Sleep(){
        System.out.println("Sleeping on Night");
    }

}

public class Example_Interface {

    public static void  main(String[] args){

        Dog obj = new Dog();

        obj.Eat();
        obj.Sleep();

        Car obj1 = new Car();

        obj1.Eat();
        obj1.Sleep();
    }
}

