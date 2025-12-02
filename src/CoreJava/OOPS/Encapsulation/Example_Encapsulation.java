package CoreJava.OOPS.Encapsulation;

class Employee{
    private int EmployeeID;
    private String EmployeeName;
    private String Dep;

   public int getEmployeeID(){
       return EmployeeID;
   }
   public void setEmployeeID(int id){
       this.EmployeeID = id;
   }
   public String getEmployeeName(){
       return EmployeeName;
   }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getDep(){
       return Dep;
    }

    public void setDep(String dep){
       this.Dep = dep;
    }
}


public class Example_Encapsulation {

    public static void main(String[] args){

        Employee obj = new Employee();

        obj.setEmployeeID(1001);
        obj.setEmployeeName("John");
        obj.setDep("Computer");

        System.out.println(obj.getEmployeeID());
        System.out.println(obj.getEmployeeName());
        System.out.println(obj.getDep());


    }
}
