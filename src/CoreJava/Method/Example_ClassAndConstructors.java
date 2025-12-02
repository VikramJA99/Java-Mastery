package CoreJava.Method;

class NewStudent{
    int id;
    String name;

    NewStudent(int id, String name){
        this.name =name;
        this.id = id;
    }

   public String toString(){
        return "NewStudent{name = " + name + ", id= " + id + " }";

    }
}

public class Example_ClassAndConstructors {

    public static void main(String[] args){

        NewStudent obj = new NewStudent(12,"John");
        NewStudent obj1 = new NewStudent(13, "Imran");


        System.out.println(obj.toString());
        System.out.println(obj1.toString());
    }


}
