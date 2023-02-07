package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

        System.out.println("----------------- Profile bean");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("----------------- PRIMARY bean");
        MyController myController = (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);

        System.out.println("----------------- Property -----------------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----------------- Setter -----------------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----------------- Constructor -----------------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("------------- TASK -------------");
        PetController petController = (PetController) ctx.getBean("petController");
        System.out.println(petController.whichPetIsTheBest());
    }

}
