package Multithreading;

public class ThreadEx extends Thread{

public void run(){
    for (int i=0;i<=5;i++){
        System.out.println(Thread.currentThread());
        System.out.println(i);

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Run Inside : sleep");
        }
    }

}
    public static void main(String[] args) {

        System.out.println("Inside main method"+ Thread.currentThread());


        ThreadEx t3= new ThreadEx();
        t3.setName("harish");

        t3.start();


//        try{
//            t3.join();
//        }catch (InterruptedException e){
//
//            System.out.println("Handled Exception");
//        }


        ThreadEx t1= new ThreadEx();
        t1.setName("nikhil");
        t1.setPriority(1);
        t1.start();

        ThreadEx t2= new ThreadEx();
        t2.setName("prasad");
//        t2.setPriority(10);
        t2.yield();

        t2.start();


    }
}
