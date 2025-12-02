package CoreJava.OOPS.Polymorphism;

class Employee{
    String NewEmployee(){
       return  "New Employee Get him Employee_ID";
    }
}
class OldEmployee extends Employee {
    @Override
    String NewEmployee() {
        return "Already Employee get Employee_ID";
    }
}


public class Example_OverRiding {

    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println(obj.NewEmployee());

        OldEmployee obj1 = new OldEmployee();
        System.out.println(obj1.NewEmployee());

    }
}

