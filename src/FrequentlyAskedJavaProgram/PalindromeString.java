package FrequentlyAskedJavaProgram;

public class PalindromeString {
    public static void main(String[] args){
        String name = "tenet";
        String org = name;
        String rev ="";

        int len =name.length();
        for (int i=len-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }

        if(org.equals(rev)){
            System.out.println("Is the Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }

    }
}
