package assignment2;

public class Questions6 extends AbstractClassEx{
    @Override
    public void m4() {
        System.out.println("inside Abstract method");

    }


    public static void main(String[] args) {
        Questions6 obj= new Questions6();
        System.out.println(obj.m1() + obj.m3());
        obj.m4();
        obj.m6();


    }

}


