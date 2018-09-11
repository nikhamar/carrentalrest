import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationEx {

    @Bean (name = "Employee")
    public  Employee provideEmployee(){
        Employee employee=new Employee();
        employee.setName("nikhil");

        return employee;

    }
    @Bean
    public Organisation provideOrganisation(){
        return new Organisation();

    }
}
