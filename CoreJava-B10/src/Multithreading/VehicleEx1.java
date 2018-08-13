package Multithreading;
@FunctionalInterface
public interface VehicleEx1 {


    void m1();
    static void m2(){
        System.out.println("Inside Interface static");

    }
    default void m3(){

        System.out.println("Inside Default");
    }

}
