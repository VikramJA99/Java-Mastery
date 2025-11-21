package days1to10.controlStatement.LoopProblem;

public class Count_Number {

    //Count number of digits in a number

    public static void main(String[] args){
        int num = 1463823;
        int count = 0;

        int temp = num;

        while (temp !=0){
            temp = temp /10;
            count++;
        }
        System.out.println("Number of digits in " + num + " = " + count);
    }

}
