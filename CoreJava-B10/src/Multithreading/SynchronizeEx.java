package Multithreading;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizeEx  {



    public static void main(String[] args) {

        PrintTable table = new PrintTable() ;

        PrintTable table1 = new PrintTable() ;
        MyThread thread = new MyThread(table);
        MyThread thread2 = new MyThread(table1);
        thread.start();
        thread2.start();

    }
}
class PrintTable {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {

            System.out.println(i);
        }


    }
}
class MyThread extends Thread{
        PrintTable t;
        MyThread(PrintTable t){
            this.t=t;
        }
public void run(){
            t.printTable(5);
}
    }





