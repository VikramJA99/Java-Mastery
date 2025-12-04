package FrequentlyAskedJavaProgram;

public class SumOfArray {
    public static void main(String[] args){
        int[] a ={3,5,6,7};
        int sum =0;

//        for (int i =0;i<a.length;i++){
//            sum =sum+a[i];
//        }

        for (int value : a){
            sum =sum+value;
        }
        System.out.println(sum);
    }
}
