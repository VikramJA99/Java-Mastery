package days1to10.controlStatement.problems;

public class Find_Age {
    // Take age as input and print whether the person is Child, Teen,Adult or senior

    public static void main(String[] args){
        int age = 20;

        if(age <= 15){
            System.out.println("Your Child");
        } else if (age <= 18) {
            System.out.println("Your Teen");
        }
        else {
            System.out.println("Your Adult or Senior");
        }
    }
}
