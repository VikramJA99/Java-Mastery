package days1to10.controlStatement.LoopProblem;

public class PalindromeNumber {
    public static void main(String[] args){
        int n = 1221;
        int real = n;
        int rev = 0;

        while (n != 0){
            rev = rev * 10 + n % 10;
            n = n/10;
        }

//        System.out.println(rev);

        if (real == rev){
            System.out.println("is palindrome");
        }else {
            System.out.println("no palindrome");
        }


    }
}
