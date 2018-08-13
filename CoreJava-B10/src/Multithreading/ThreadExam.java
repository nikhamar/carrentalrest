package Multithreading;

public class ThreadExam implements Runnable{
    @Override
    public void run() {

        for (int i=0;i<=5;i++){
            System.out.println("Inside run "+ Thread.currentThread());

        }


    }

    public static void main(String[] args) {
        System.out.println("Inside main method  " + Thread.currentThread());
        ThreadExam t= new ThreadExam();

        Thread t1= new Thread(t, "nikhil");
        t1.start();


    }



}




