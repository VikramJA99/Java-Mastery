package days1to10.controlStatement;

public class Day1_Switch_Statement {
    public static void main(String[] args){

//        int days = 10;
//
//
//        switch (days){
//            case 1:System.out.println("Monday");break;
//            case 2:System.out.println("Tuesday");break;
//            case 3:System.out.println("Wednesday");break;
//            default:System.out.println("Invalid");
//        }

        int day = 1;

        String result = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesdys";
            default -> "Invalid";


        };
        System.out.println(result);

    }
}
