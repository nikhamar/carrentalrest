package com.mypackage.services;
import com.mypackage.models.Registration;
import com.mypackage.repositories.RegistrationRepository;
import com.mypackage.hibernate.HibernateRepositoryEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;
   @Autowired
    HibernateRepositoryEx hibernateRepositoryEx;



    public void registerUser(Registration registration) {

        hibernateRepositoryEx.doNothing(registration);


//        registrationRepository.registerUser(registration);
    }

}

