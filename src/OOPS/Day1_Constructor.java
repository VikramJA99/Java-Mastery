package OOPS;

class Animal{
    String animalName;

    Animal(String animalName){
        this.animalName = animalName;
        System.out.println(animalName);
    }

}


public class Day1_Constructor {

    public static void main(String[] args){
        Animal obj = new Animal("Dog");
        Animal obj1 = new Animal("Cat");


    }
}
