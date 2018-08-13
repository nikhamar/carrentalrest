package Multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorEx1 implements Runnable {


    @Override
    public void run() {
        System.out.println("inside run "+ Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        ScheduledExecutorService e1 = Executors.newSingleThreadScheduledExecutor();

        e1.schedule(new ExecutorEx1(),5,TimeUnit.SECONDS);
        e1.shutdown();
    }
}
