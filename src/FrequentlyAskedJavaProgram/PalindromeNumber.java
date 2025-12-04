package FrequentlyAskedJavaProgram;

public class PalindromeNumber {
    public static void main(String[] args){
        int num = 12214;
        int org = num;
        int rev = 0;

        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        if (org == rev){
            System.out.println("Is the Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
