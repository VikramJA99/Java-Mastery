package OOPS;

class Car{
    String car;
    int number;

    void Start(){
        System.out.println("Car Class");
    }
}




public class Day1_Class_Object {
    public static void main(String[] args){
        Car obj = new Car();
        obj.car="New model";
        obj.number=2345;
        obj.Start();

        System.out.println(obj.car);
        System.out.println(obj.number);



    }


}
