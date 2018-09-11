package springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.mypackage.controller.RegistrationController.viewRegistration(..))")
    public void before(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
    }
    @After("execution(* com.mypackage.controller.RegistrationController.viewRegistration())")
    public void after(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());


    }
}
