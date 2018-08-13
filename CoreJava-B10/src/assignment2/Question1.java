package assignment2;

public class Question1 implements InterfaceEx1, InterfaceEx2 {

    public static void main(String[] args) {

        Question1 obj= new Question1();
        System.out.println(obj.m1() + obj.m2() );
    }@Override
    public String m1() {
        return "nikhil";
    }

    @Override
    public String m2() {
        return "Amaraneni";
    }
}
