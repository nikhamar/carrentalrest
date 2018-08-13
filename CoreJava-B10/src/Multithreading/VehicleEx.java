package Multithreading;

public class VehicleEx implements VehicleEx1 {


    static void  m2(){
    System.out.println("inside static");
}

    @Override
    public void m1() {
        System.out.println("inside m1");
    }

    public static void main(String[] args) {
        VehicleEx obj=new VehicleEx();
        obj.m1();
        VehicleEx.m2();
        obj.m3();


    }
}
