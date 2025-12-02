package days1to10.DesignPattern;

class Database {

    private static  Database instance;

    private Database(){
        System.out.println("Singleton Program ");
    }

    public static  Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }

}



public class DataBaseDemo{
    public static void main(String[] args){
        Database obj = Database.getInstance();
        Database obj1 = Database.getInstance();

        System.out.println(obj == obj1);
    }
}