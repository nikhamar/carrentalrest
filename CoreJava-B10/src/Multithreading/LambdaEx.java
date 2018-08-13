package Multithreading;

public class LambdaEx {

    interface  MathOperation{
        int operation(int a, int b);

    }
    interface GreetingService{
        void sayMessage(String message);}

    private int operation(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);

    }

    public static void main(String[] args) {

        LambdaEx obj =new LambdaEx();
        MathOperation Addition=(a,b) -> a+b;
       MathOperation Substraction = (a,b) -> a-b;
        MathOperation Multiple = (a,b) -> a*b;
        MathOperation Divide = (a,b) -> a/b;
        System.out.println(obj.operation(3,5, Addition));
        System.out.println( obj.operation(15,5, Substraction));
        System.out.println( obj.operation(3,5, Multiple));
        System.out.println(obj.operation(10,5, Divide));


    }

}

