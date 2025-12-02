package CoreJava.Method;


class Student{
    String name;
    String group;
}


public class Example_ClassAndObject {
    public static void main(String[] args){

        Student obj = new Student();
        obj.name = "John";
        obj.group = "A";

        System.out.println(obj.name);
        System.out.println(obj.group);
    }


}
