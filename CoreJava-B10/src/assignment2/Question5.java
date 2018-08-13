package assignment2;

public class Question5 {
    String t1;

    static {
        System.out.println("inside statsic block");
    }


    public Question5(String t){
        this.t1=t;
        System.out.println(t1);
    }
    {
        System.out.println("inside instance block");
    }
    public static void main(String[] args) {
        Question5 obj=new Question5("nikhil");
        Question5 obj1=new Question5("Amaraneni");



    }
}
