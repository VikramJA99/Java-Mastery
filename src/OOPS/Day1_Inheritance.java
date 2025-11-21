package OOPS;

class Animals{
    void eat(){
        System.out.println("Eating...........");
    }

}

class Dog extends Animals{
    void bark(){
        System.out.println("Barking............");
    }


}

public class Day1_Inheritance {

    public static void main(String[] args){

        Dog d = new Dog();
        d.bark();
        d.eat();
    }

}
