import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {


    public static void main(String[] args) {
//        ApplicationContext context= new ClassPathXmlApplicationContext("annotationContext.xml");
//        Employee employee=(Employee) context.getBean("employee");
//        System.out.println(employee.getName()+"\n"+ employee.getDescription()+"\n"+employee.getId()+"\n"+employee.getSalary());
//   Organisation organisation=(Organisation) context.getBean("organisation");
//        System.out.println("organisation employee :" + organisation.getEmployee().getName());

  ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationEx.class);
  Employee employee=(Employee) context.getBean("Employee");
        System.out.println(employee.getName());

    }
}
