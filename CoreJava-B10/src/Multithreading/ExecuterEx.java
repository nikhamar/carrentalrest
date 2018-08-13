package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterEx {


    public static void main(String[] args) {
        ExecutorService executor1 = Executors.newFixedThreadPool(5);//creating a fixed pool of 5


            Runnable worker = new Runnable() {
                @Override
                public void run() {
                    System.out.println("inside run method  " + Thread.currentThread());
                }
            };

        for (int i=0;i<10;i++){
            executor1.execute(worker);
        }
        executor1.shutdown();

        while(!executor1.isTerminated()){

        }System.out.println("Finished all threads");

    }
}
