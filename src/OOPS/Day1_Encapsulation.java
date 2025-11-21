package OOPS;

class Person{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Day1_Encapsulation {

    public static void main(String[] args){

        Person obj = new Person();
        obj.setName("Imran");
        obj.setAge(25);
        System.out.println(obj.getName() + obj.getAge());


    }

}
