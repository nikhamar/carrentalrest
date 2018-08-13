package assignment2;

public abstract class AbstractClassEx implements InterfaceEx3,InterfaceEx1 {
    @Override
    public String m1() {
        return "Nikhil";
    }

    @Override
    public int m3() {
        return 404;
    }


    abstract void m4();
    public void m6(){
        System.out.println("concrete class");
    }
}
