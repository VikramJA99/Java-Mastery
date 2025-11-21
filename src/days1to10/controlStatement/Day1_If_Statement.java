package days1to10.controlStatement;

public class Day1_If_Statement {
    public static void main(String[] args){

        int marks = 85;

        if(marks >= 90){
            System.out.println("A+ Grade");
        }
        else if(marks >= 80){
            System.out.println("B+ Grade");
        } else if (marks >= 70) {
            System.out.println("B Grade");

        }
        else {
            System.out.println("Keep Working Hard");
        }

    }
}
