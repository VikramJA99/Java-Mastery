package CoreJava.ControlStatement;

public class Example_SwitchStatement {
    public static void main(String[] args){

        int days = 5;

        switch (days){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesdays");
            break;
            default: System.out.println("Invalid Day");
        }





//
//        switch (days){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            default -> System.out.println("Invalid day");
//        }
    }
}
