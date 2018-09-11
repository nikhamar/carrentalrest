import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloExMain {
    public static void main(String[] args) {
//        HelloWorld x= new HelloWorld();
//
//        x.setMessage("hello");
//
//        System.out.println(x.getMessage());


        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
//        HelloWorld helloWorld=(HelloWorld) context.getBean("Hello");
////        helloWorld.setMessage("HelloWorld");
//
//        System.out.println(helloWorld.getMessage());

//        HelloWorld helloworld1 = (HelloWorld) context.getBean("Hello");
//        System.out.println(helloworld1.getMessage());
//        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        Hello hello=(Hello) context.getBean("hey");
        System.out.println(hello.getMessage().getMessage());

//        Book book=(Book) context.getBean("books");
//
//        System.out.println(book.getBooknames());
     }
}
