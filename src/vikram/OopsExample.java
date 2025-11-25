package vikram;

class Car{
    String brand;
    String model;
    int price;

    Car(String brand,String model,int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void Start(){
        System.out.println("Car Stating.......");


    }
    void Stop(){
        System.out.println("Car Stopping....");
    }
}




public class OopsExample {


    public static void main(String[] args){
                   /*Create a Car class

        fields: brand, model, price

        methods: start(), stop()

        Create 3 car objects and print their details.

             */



        Car car = new Car("Honda","new",2025);
        Car car1 = new Car("BMW","new",2025);
        Car car2 = new Car("Toyota","new",2025);

        car.Start();
        car.Stop();
        System.out.println(car.toString());
        System.out.println(car1.toString());
        System.out.println(car2.toString());






    }
}
