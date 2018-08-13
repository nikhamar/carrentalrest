package Multithreading;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableEx implements Callable {


    @Override
    public String call() throws Exception {

        Set s1=new HashSet();
        s1.add("abc");
        s1.add("xyz");
        s1.add("ghi");
        Iterator itr=  s1.iterator();
        while (itr.hasNext()){

            System.out.println(itr.next());
        }



        return "Hello";
    }

    public static void main(String[] args) {
        CallableEx c1=new CallableEx();
        FutureTask f1=new FutureTask(c1);
        Thread t1=new Thread(f1);
        t1.start();
        try {
            System.out.println(f1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
