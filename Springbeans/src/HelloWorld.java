public class HelloWorld {

    private String message;

    public HelloWorld(String message){

        this.message=message;
    }
    public  String getMessage(){
        return message;

    }
    public void init(){
        System.out.println("init method");
    }
    public void destroy(){
        System.out.println("destroy method");
    }
//    public void setMessage(String message){
//        this.message=message;
//    }
}
