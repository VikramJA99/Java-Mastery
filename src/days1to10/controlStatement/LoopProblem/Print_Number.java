package days1to10.controlStatement.LoopProblem;

public class Print_Number {
    public static void main(String[] args){
//        for (int i=1; i<=100; i++){
//            System.out.println(i);
//        }
//
        // only even number print

        for (int i =0;i<=20;i++){
            if (i%2 ==0){
                System.out.println("Even number : " +i);
            } else {
                System.out.println("odd number : " +i);
            }
        }


    }
}
