package OOPS;

class School{
    void bell(){
        System.out.println("Time Over");
    }
}

class Exam extends School{

    @Override
    void bell(){
        System.out.println("Time on");
        super.bell();
    }
}
public class Day1_Polymorphism2 {
    public static void main(String[] args){
        Exam obj = new Exam();
        obj.bell();
//        School obj1 = new School();
//        obj1.bell();
    }

}
