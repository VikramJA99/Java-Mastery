package days1to10.Multithreading;

//class  Book extends Thread{
//    public void run()  {
//        for (int i=1; i<=5; i++){
//            System.out.println("Updating DB");
//            try {
//                Thread.sleep(7000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}


class Book implements Runnable{
    public  void run(){
        for (int i =1; i <=5; i++){
            System.out.println("Updating DB");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class  Car {
    synchronized void Table(int n){
        for (int i =1;i<=5;i++){
            System.out.println(n*i);
        }

    }
}

//class Num extends Thread{
//    public void run(){
//        for (int i=1;i<=5;i++){
//            System.out.println(i);
//            try{Thread.sleep(1000);} catch (InterruptedException e) {}
//        }
//    }
//}



public class MultithreadingDemo {

    public static void main(String[] args) throws InterruptedException{


        Runnable book = new Book();
        Car car = new Car();
        car.Table(2);
     //   Num fun = new Num();

        Runnable fun = () -> {
            for (int i = 1;i<=5;i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(book);
        Thread t2 = new Thread(fun);


        t1.start();
        t2.start();
        t1.join();
        t2.join();



//        fun.start();
        System.out.println("Bye....");

//        Book book = new Book();

        //   book.updateDB();
       // fun.print();
     //   book.start();




//        if (book.isAlive()) {
//            {
//                System.out.println("Code is running...");
//            }
//        }
//
//        book.join();
//        fun.join();
//
//        if (book.isAlive()){
//            System.out.println("Code is ending,,,,,");
//        }
//


    }
}
