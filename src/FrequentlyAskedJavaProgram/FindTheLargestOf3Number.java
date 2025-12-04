package FrequentlyAskedJavaProgram;

public class FindTheLargestOf3Number {
    public static void main(String[] args){
        int a=20;
        int b=5;
        int c =10;

//        if (a>b && a>c){
//            System.out.println("A is the Largest Number:" +a);
//        } else if (b>a && b>c) {
//            System.out.println("B is the Largest Number:" +b);
//        }else {
//            System.out.println("C is the Larget Number:" + c);
//        }

        int Largest =a>b?a:b;
        int Largest1 = c>Largest?c:Largest;
        System.out.println(Largest1);


    }
}
