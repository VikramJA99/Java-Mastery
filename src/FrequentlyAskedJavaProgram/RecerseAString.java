package FrequentlyAskedJavaProgram;

public class RecerseAString {

    public static void main(String[] args){

        String name = "tenet";
        String rev = "";
//        int len = name.length();
//
//        for (int i =len-1; i>=0;i--){
//            rev = rev + name.charAt(i);
//
//        }
//        System.out.println("Reverse a String is : " + rev);


        char a[] = name.toCharArray();
        int len1 =a.length;
        for (int i=len1-1;i>=0;i--){
            rev = rev+a[i];
        }
        System.out.println("Using Char String Reverse is :"+rev);

    }
}
