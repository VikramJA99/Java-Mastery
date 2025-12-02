package CoreJava.OOPS.Inheritance;

class Animal{
    void eat(){
        System.out.println("Eating.........");
    }

}

class Dog extends Animal{
    void sleep(){
        System.out.println("Sleeping......");
    }
}
class Cat extends Dog {
    void walk(){
        System.out.println("Waking................");
    }
}

public class Example_Inheritance {

    public static void main(String[] args){

        Cat obj = new Cat();
        obj.eat();
        obj.sleep();
        obj.walk();

    }
}
