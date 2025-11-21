package days1to10.controlStatement.problems;

import java.util.Scanner;

public class Calculatior {
    public static void main(String[] args){
        // Calculator with -+*/% using switch
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        double a = sc.nextDouble();


        System.out.println("Enter b number :");
        double b = sc.nextDouble();


        System.out.println("Enter operator (+-*/%) : ");
        char op = sc.next().charAt(0);


        switch (op){
            case '+':System.out.println(a + b);break;
            case  '-':System.out.println(a-b);break;
            case  '*':System.out.println(a*b);break;
            case '/':System.out.println(a/b);break;
            case '%':System.out.println(a%b);break;
            default:System.out.println("Invalid");
        }




    }
}
