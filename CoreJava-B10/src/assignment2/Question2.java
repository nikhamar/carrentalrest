package assignment2;

public class Question2 implements InterfaceEx3,InterfaceEx1 {

    public static void main(String[] args) {

        Question2 obj= new Question2();

        System.out.println(obj.m1()+obj.m3());
    }
    @Override
    public int m3() {
        return 156;
    }

    @Override
    public String m1() {
        return "harish";
    }
}
